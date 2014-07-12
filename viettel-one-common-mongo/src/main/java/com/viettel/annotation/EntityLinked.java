package com.viettel.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface EntityLinked {
	public Class<?> entityClazz();
	
//	public Class<?> keyClazz();
	
	public Class<?> pkClazz();
	
	public String idProperty();
	
	public String captionProperty() default "name";
	
	public String emptyValue() default "";
	
	public LinkedType type() default LinkedType.DROPDOWN;
	
	/** Condition Filter */
	public String condition() default "";
	/** Condition Filter Parameter */
//	public String params() default "";
	
	public boolean canNew() default true;
	
	public boolean checkClient() default true;
	
	public boolean checkOrg() default true;
	
	public boolean checkApp() default true;
}
