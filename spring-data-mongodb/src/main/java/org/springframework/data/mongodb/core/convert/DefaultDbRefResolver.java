/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.mongodb.core.convert;

import static org.springframework.util.ReflectionUtils.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.Factory;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.data.mongodb.LazyLoadingException;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.mapping.MongoPersistentEntity;
import org.springframework.data.mongodb.core.mapping.MongoPersistentProperty;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

import com.mongodb.DB;
import com.mongodb.DBRef;

/**
 * A {@link DbRefResolver} that resolves {@link org.springframework.data.mongodb.core.mapping.DBRef}s by delegating to a
 * {@link DbRefResolverCallback} than is able to generate lazy loading proxies.
 * 
 * @author Thomas Darimont
 * @author Oliver Gierke
 * @since 1.4
 */
public class DefaultDbRefResolver implements DbRefResolver {

	private static final boolean OBJENESIS_PRESENT = ClassUtils.isPresent("org.objenesis.Objenesis", null);

	private final MongoDbFactory mongoDbFactory;
	private final PersistenceExceptionTranslator exceptionTranslator;

	/**
	 * Creates a new {@link DefaultDbRefResolver} with the given {@link MongoDbFactory}.
	 * 
	 * @param mongoDbFactory must not be {@literal null}.
	 */
	public DefaultDbRefResolver(MongoDbFactory mongoDbFactory) {

		Assert.notNull(mongoDbFactory, "MongoDbFactory translator must not be null!");

		this.mongoDbFactory = mongoDbFactory;
		this.exceptionTranslator = mongoDbFactory.getExceptionTranslator();
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.data.mongodb.core.convert.DbRefResolver#resolveDbRef(org.springframework.data.mongodb.core.mapping.MongoPersistentProperty, org.springframework.data.mongodb.core.convert.DbRefResolverCallback)
	 */
	@Override
	public Object resolveDbRef(MongoPersistentProperty property, DBRef dbref, DbRefResolverCallback callback) {

		Assert.notNull(property, "Property must not be null!");
		Assert.notNull(callback, "Callback must not be null!");

		if (isLazyDbRef(property)) {
			return createLazyLoadingProxy(property, dbref, callback);
		}

		return callback.resolve(property);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.springframework.data.mongodb.core.convert.DbRefResolver#created(org.springframework.data.mongodb.core.mapping.MongoPersistentProperty, org.springframework.data.mongodb.core.mapping.MongoPersistentEntity, java.lang.Object)
	 */
	@Override
	public DBRef createDbRef(org.springframework.data.mongodb.core.mapping.DBRef annotation,
			MongoPersistentEntity<?> entity, Object id) {

		DB db = mongoDbFactory.getDb();
		db = annotation != null && StringUtils.hasText(annotation.db()) ? mongoDbFactory.getDb(annotation.db()) : db;

		return new DBRef(db, entity.getCollection(), id);
	}

	/**
	 * Creates a proxy for the given {@link MongoPersistentProperty} using the given {@link DbRefResolverCallback} to
	 * eventually resolve the value of the property.
	 * 
	 * @param property must not be {@literal null}.
	 * @param dbref can be {@literal null}.
	 * @param callback must not be {@literal null}.
	 * @return
	 */
	private Object createLazyLoadingProxy(MongoPersistentProperty property, DBRef dbref, DbRefResolverCallback callback) {

		ProxyFactory proxyFactory = new ProxyFactory();
		Class<?> propertyType = property.getType();

		for (Class<?> type : propertyType.getInterfaces()) {
			proxyFactory.addInterface(type);
		}

		LazyLoadingInterceptor interceptor = new LazyLoadingInterceptor(property, dbref, exceptionTranslator, callback);

		proxyFactory.addInterface(LazyLoadingProxy.class);

		if (propertyType.isInterface()) {
			proxyFactory.addInterface(propertyType);
			proxyFactory.addAdvice(interceptor);
			return proxyFactory.getProxy();
		}

		proxyFactory.setProxyTargetClass(true);
		proxyFactory.setTargetClass(propertyType);

		if (!OBJENESIS_PRESENT) {
			proxyFactory.addAdvice(interceptor);
			return proxyFactory.getProxy();
		}

		return ObjenesisProxyEnhancer.enhanceAndGet(proxyFactory, propertyType, interceptor);
	}

	/**
	 * Returns whether the property shall be resolved lazily.
	 * 
	 * @param property must not be {@literal null}.
	 * @return
	 */
	private boolean isLazyDbRef(MongoPersistentProperty property) {
		return property.getDBRef() != null && property.getDBRef().lazy();
	}

	/**
	 * A {@link MethodInterceptor} that is used within a lazy loading proxy. The property resolving is delegated to a
	 * {@link DbRefResolverCallback}. The resolving process is triggered by a method invocation on the proxy and is
	 * guaranteed to be performed only once.
	 * 
	 * @author Thomas Darimont
	 * @author Oliver Gierke
	 */
	static class LazyLoadingInterceptor implements MethodInterceptor, org.springframework.cglib.proxy.MethodInterceptor,
			Serializable {

		private static final Method INITIALIZE_METHOD, TO_DBREF_METHOD;

		private final DbRefResolverCallback callback;
		private final MongoPersistentProperty property;
		private final PersistenceExceptionTranslator exceptionTranslator;

		private volatile boolean resolved;
		private Object result;
		private DBRef dbref;

		static {
			try {
				INITIALIZE_METHOD = LazyLoadingProxy.class.getMethod("initialize");
				TO_DBREF_METHOD = LazyLoadingProxy.class.getMethod("toDBRef");
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		/**
		 * Creates a new {@link LazyLoadingInterceptor} for the given {@link MongoPersistentProperty},
		 * {@link PersistenceExceptionTranslator} and {@link DbRefResolverCallback}.
		 * 
		 * @param property must not be {@literal null}.
		 * @param dbref can be {@literal null}.
		 * @param callback must not be {@literal null}.
		 */
		public LazyLoadingInterceptor(MongoPersistentProperty property, DBRef dbref,
				PersistenceExceptionTranslator exceptionTranslator, DbRefResolverCallback callback) {

			Assert.notNull(property, "Property must not be null!");
			Assert.notNull(exceptionTranslator, "Exception translator must not be null!");
			Assert.notNull(callback, "Callback must not be null!");

			this.dbref = dbref;
			this.callback = callback;
			this.exceptionTranslator = exceptionTranslator;
			this.property = property;
		}

		/*
		 * (non-Javadoc)
		 * @see org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.intercept.MethodInvocation)
		 */
		@Override
		public Object invoke(MethodInvocation invocation) throws Throwable {
			return intercept(invocation.getThis(), invocation.getMethod(), invocation.getArguments(), null);
		}

		/* 
		 * (non-Javadoc)
		 * @see org.springframework.cglib.proxy.MethodInterceptor#intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], org.springframework.cglib.proxy.MethodProxy)
		 */
		@Override
		public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

			if (INITIALIZE_METHOD.equals(method)) {
				return ensureResolved();
			}

			if (TO_DBREF_METHOD.equals(method)) {
				return this.dbref;
			}

			if (isObjectMethod(method) && Object.class.equals(method.getDeclaringClass())) {

				if (ReflectionUtils.isToStringMethod(method)) {
					return proxyToString(proxy);
				}

				if (ReflectionUtils.isEqualsMethod(method)) {
					return proxyEquals(proxy, args[0]);
				}

				if (ReflectionUtils.isHashCodeMethod(method)) {
					return proxyHashCode(proxy);
				}
			}

			Object target = ensureResolved();

			if (target == null) {
				return null;
			}

			return method.invoke(target, args);
		}

		/**
		 * Returns a to string representation for the given {@code proxy}.
		 * 
		 * @param proxy
		 * @return
		 */
		private String proxyToString(Object proxy) {

			StringBuilder description = new StringBuilder();
			if (dbref != null) {
				description.append(dbref.getRef());
				description.append(":");
				description.append(dbref.getId());
			} else {
				description.append(System.identityHashCode(proxy));
			}
			description.append("$").append(LazyLoadingProxy.class.getSimpleName());

			return description.toString();
		}

		/**
		 * Returns the hashcode for the given {@code proxy}.
		 * 
		 * @param proxy
		 * @return
		 */
		private int proxyHashCode(Object proxy) {
			return proxyToString(proxy).hashCode();
		}

		/**
		 * Performs an equality check for the given {@code proxy}.
		 * 
		 * @param proxy
		 * @param that
		 * @return
		 */
		private boolean proxyEquals(Object proxy, Object that) {

			if (!(that instanceof LazyLoadingProxy)) {
				return false;
			}

			if (that == proxy) {
				return true;
			}

			return proxyToString(proxy).equals(that.toString());
		}

		/**
		 * Will trigger the resolution if the proxy is not resolved already or return a previously resolved result.
		 * 
		 * @return
		 */
		private Object ensureResolved() {

			if (!resolved) {
				this.result = resolve();
				this.resolved = true;
			}

			return this.result;
		}

		/**
		 * Callback method for serialization.
		 * 
		 * @param out
		 * @throws IOException
		 */
		private void writeObject(ObjectOutputStream out) throws IOException {

			ensureResolved();
			out.writeObject(this.result);
		}

		/**
		 * Callback method for deserialization.
		 * 
		 * @param in
		 * @throws IOException
		 */
		private void readObject(ObjectInputStream in) throws IOException {

			try {
				this.resolved = true;
				this.result = in.readObject();
			} catch (ClassNotFoundException e) {
				throw new LazyLoadingException("Could not deserialize result", e);
			}
		}

		/**
		 * Resolves the proxy into its backing object.
		 * 
		 * @return
		 */
		private synchronized Object resolve() {

			if (!resolved) {

				try {

					return callback.resolve(property);

				} catch (RuntimeException ex) {

					DataAccessException translatedException = this.exceptionTranslator.translateExceptionIfPossible(ex);
					throw new LazyLoadingException("Unable to lazily resolve DBRef!", translatedException);
				}
			}

			return result;
		}
	}

	/**
	 * Static class to accommodate optional dependency on Objenesis.
	 * 
	 * @author Oliver Gierke
	 * @author Thomas Darimont
	 * @since 1.4
	 */
	private static class ObjenesisProxyEnhancer {

		private static final boolean IS_SPRING_4_OR_BETTER = ClassUtils.isPresent(
				"org.springframework.core.DefaultParameterNameDiscoverer", null);

		private static final InstanceCreatorStrategy INSTANCE_CREATOR;

		static {

			if (IS_SPRING_4_OR_BETTER) {
				INSTANCE_CREATOR = new Spring4ObjenesisInstanceCreatorStrategy();
			} else {
				INSTANCE_CREATOR = new DefaultObjenesisInstanceCreatorStrategy();
			}
		}

		public static Object enhanceAndGet(ProxyFactory proxyFactory, Class<?> type,
				org.springframework.cglib.proxy.MethodInterceptor interceptor) {

			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(type);
			enhancer.setCallbackType(org.springframework.cglib.proxy.MethodInterceptor.class);
			enhancer.setInterfaces(new Class[] { LazyLoadingProxy.class });

			Factory factory = (Factory) INSTANCE_CREATOR.newInstance(enhancer.createClass());
			factory.setCallbacks(new Callback[] { interceptor });
			return factory;
		}

		/**
		 * Strategy for constructing new instances of a given {@link Class}.
		 * 
		 * @author Thomas Darimont
		 */
		interface InstanceCreatorStrategy {
			Object newInstance(Class<?> clazz);
		}

		/**
		 * An {@link InstanceCreatorStrategy} that uses Objenesis from the classpath.
		 * 
		 * @author Thomas Darimont
		 */
		private static class DefaultObjenesisInstanceCreatorStrategy implements InstanceCreatorStrategy {

			private static final Objenesis OBJENESIS = new ObjenesisStd(true);

			/*
			 * (non-Javadoc)
			 * @see org.springframework.data.mongodb.core.convert.DefaultDbRefResolver.ObjenesisProxyEnhancer.InstanceCreatorStrategy#newInstance(java.lang.Class)
			 */
			@Override
			public Object newInstance(Class<?> clazz) {
				return OBJENESIS.newInstance(clazz);
			}
		}

		/**
		 * An {@link InstanceCreatorStrategy} that uses a repackaged version of Objenesis from Spring 4.
		 * 
		 * @author Thomas Darimont
		 */
		private static class Spring4ObjenesisInstanceCreatorStrategy implements InstanceCreatorStrategy {

			private static final String SPRING4_OBJENESIS_CLASS_NAME = "org.springframework.objenesis.ObjenesisStd";
			private static final Object OBJENESIS;
			private static final Method NEW_INSTANCE_METHOD;

			static {

				try {
					Class<?> objenesisClass = ClassUtils.forName(SPRING4_OBJENESIS_CLASS_NAME,
							ObjenesisProxyEnhancer.class.getClassLoader());

					OBJENESIS = BeanUtils.instantiateClass(objenesisClass.getConstructor(boolean.class), true);
					NEW_INSTANCE_METHOD = objenesisClass.getMethod("newInstance", Class.class);

				} catch (Exception e) {
					throw new RuntimeException("Could not setup Objenesis infrastructure with Spring 4 ", e);
				}
			}

			/*
			 * (non-Javadoc)
			 * @see org.springframework.data.mongodb.core.convert.DefaultDbRefResolver.ObjenesisProxyEnhancer.InstanceCreatorStrategy#newInstance(java.lang.Class)
			 */
			@Override
			public Object newInstance(Class<?> clazz) {

				try {
					return NEW_INSTANCE_METHOD.invoke(OBJENESIS, clazz);
				} catch (Exception e) {
					throw new RuntimeException("Could not created instance for " + clazz, e);
				}
			}
		}
	}
}
