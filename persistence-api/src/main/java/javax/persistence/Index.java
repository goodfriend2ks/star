/*
 * Copyright (c) 2008, 2009, 2011 Oracle, Inc. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.  The Eclipse Public License is available
 * at http://www.eclipse.org/legal/epl-v10.html and the Eclipse Distribution License
 * is available at http://www.eclipse.org/org/documents/edl-v10.php.
 */
package javax.persistence;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * The Index annotation is used in schema generation. Note that it is not necessary to specify an index
 * for a primary key, as the primary key index will be created automatically, however, the Index annotation
 * may be used to specify the ordering of the columns in the index for the primary key.
 *
 * @since JPA 2.1
 */
@Target({TYPE, METHOD, FIELD}) 
@Retention(RUNTIME)
public @interface Index {
	/**
	 * (Optional) The name of the index.  Defaults to a provider-generated value.
	 *
	 * @return The index name
	 */
	String name() default "";

	/**
	 * (Required) The names of the columns to be included in the index.
	 *
	 * @return The names of the columns making up the index
	 */
	String columnList() default "";

	/**
	 * (Optional) Whether the index is unique.  Default is false.
	 *
	 * @return Is the index unique?
	 */
	boolean unique() default false;
	
	IndexDirection direction() default IndexDirection.ASCENDING;
	
	/**
	 * If set to true index will skip over any document that is missing the indexed field.
	 * 
	 * @return
	 */
	boolean sparse() default false;

	/**
	 * @return
	 */
	boolean dropDups() default false;

	/**
	 * If set to {@literal true} then MongoDB will ignore the given index name and instead generate a new name. Defaults
	 * to {@literal false}.
	 * 
	 * @return
	 * @since 1.5
	 */
	boolean useGeneratedName() default false;

	/**
	 * Schema/Colleciton name for index to be created on.
	 * 
	 * @return
	 */
	String schema() default "";

	/**
	 * If {@literal true} the index will be created in the background.
	 * 
	 * @return
	 */
	boolean background() default false;

	/**
	 * Configures the number of seconds after which the collection should expire. Defaults to -1 for no expiry.
	 * 
	 * @return
	 */
	int expireAfterSeconds() default -1;
}
