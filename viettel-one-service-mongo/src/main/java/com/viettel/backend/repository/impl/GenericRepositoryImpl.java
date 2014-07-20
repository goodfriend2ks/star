package com.viettel.backend.repository.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.GenericQuery;

import com.viettel.backend.common.EO;
import com.viettel.backend.repository.GenericRepository;

public abstract class GenericRepositoryImpl<T extends EO<PK>, PK extends Serializable> 
	extends BasicRepositoryImpl<T, PK> 
	implements GenericRepository<T, PK> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7641250283840412529L;

	private Class<T> typeClazz;
//	private Class<KT> keyClazz;
	private Class<PK> pkClazz;
	
	@SuppressWarnings("unchecked")
	public GenericRepositoryImpl() {
		Class<?> superClazz = getClass();
		Type superType = superClazz.getGenericSuperclass();
		while (!(superType instanceof ParameterizedType)) {
			superClazz = superClazz.getSuperclass();
			superType = superClazz.getGenericSuperclass();
		}
		
		int paraIndex = 0;
		ParameterizedType genericSuperclass = (ParameterizedType)superType;
        this.typeClazz = (Class<T>) genericSuperclass.getActualTypeArguments()[paraIndex++];
//        this.keyClazz = (Class<KT>) genericSuperclass.getActualTypeArguments()[paraIndex++];
        this.pkClazz = (Class<PK>) genericSuperclass.getActualTypeArguments()[paraIndex++];
	}

	/**** Find By ID *****/
	/*@Override
	public T findById(PK key) {
		return findById(typeClazz, pkClazz, key);
	}*/

	@Override
	public T findById(UUID tenant_ID, PK id) {
		return findById(typeClazz, pkClazz, tenant_ID, id);
	}

	/** Get Count ***/
	@Override
	public long getCount(UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
		return getCount(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query);
	}

	/** Get First **/
	@Override
	public T getFirst(UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
		return getFirst(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query);
	}

	/** Get List **/
	@Override
	public List<T> getList(UUID tenant_ID, UUID org_ID, UUID app_ID, GenericQuery query) {
		return getList(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, query);
	}

	@Override
	public List<T> getList(UUID tenant_ID, UUID org_ID, UUID app_ID,
			GenericQuery query, int firstResult, int maxResults) {
		return getList(typeClazz, pkClazz, 
				tenant_ID, org_ID, app_ID, 
				query, firstResult, maxResults);
	}

	/** Save **/
	@Override
	public PK save(T entity, boolean localTrx) {
		return save(typeClazz, pkClazz, entity, localTrx);
	}

	/** Delete **/
	@Override
	public boolean delete(T entity, boolean localTrx) {
		return delete(typeClazz, pkClazz, entity, localTrx);
	}

	/*@Override
	public boolean delete(PK key, boolean localTrx) {
		return delete(typeClazz, pkClazz, key, localTrx);
	}*/

	@Override
	public boolean delete(UUID tenant_ID, PK id, boolean localTrx) {
		return delete(typeClazz, pkClazz, tenant_ID, id, localTrx);
	}

//	@Override
//	public int delete(UUID tenant_ID, List<PK> ids, boolean localTrx) {
//		return delete(typeClazz, pkClazz, tenant_ID, ids, localTrx);
//	}

	public int delete(UUID tenant_ID, GenericQuery query, boolean localTrx) {
		return delete(typeClazz, pkClazz, tenant_ID, query, localTrx);
	}
	
	/** Set Active **/
//	@Override
//	public boolean setActive(PK key, boolean isActive, boolean localTrx) {
//		return setActive(typeClazz, pkClazz, key, isActive, localTrx);
//	}

	@Override
	public boolean setActive(UUID tenant_ID, PK id, boolean isActive, boolean localTrx) {
		return setActive(typeClazz, pkClazz, tenant_ID, id, isActive, localTrx);
	}

//	@Override
//	public int setActive(UUID tenant_ID, List<PK> ids, boolean isActive, boolean localTrx) {
//		return setActive(typeClazz, pkClazz, tenant_ID, ids, isActive, localTrx);
//	}

	@Override
	public int setActive(UUID tenant_ID, GenericQuery query, boolean isActive, boolean localTrx) {
		return setActive(typeClazz, pkClazz, tenant_ID, query, isActive, localTrx);
	}
}
