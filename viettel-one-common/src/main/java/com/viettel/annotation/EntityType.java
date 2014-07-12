package com.viettel.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface EntityType {
	/** Data store in current and root client */
	public boolean withRootClient() default false;
	
	/** Data store in current and root org */
	public boolean withRootOrg() default true;
	
	/** Data store in current and root app */
	public boolean withRootApp() default false;
	
	/** Data store in only root client */
	public boolean alwayRootClient() default false;
	
	/** Data store in only root org */
	public boolean alwayRootOrg() default false;
	
	/** Data store in only root app */
	public boolean alwayRootApp() default false;
	
	/** Have ad_Org_ID property **/
	public boolean hasOrg() default true;
	
	/** Have ad_App_ID property **/
	public boolean hasApp() default true;
}
