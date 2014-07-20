package com.viettel.util;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.viettel.annotation.EntityType;
import com.viettel.backend.common.EO;

public class EntityUtil {
	
	private static Map<Class<?>, UUID> tenantCache = new HashMap<>();
	private static Map<Class<?>, UUID> orgCache = new HashMap<>();
	private static Map<Class<?>, UUID> appCache = new HashMap<>();
	
	public static UUID getTenant_ID(Class<?> clazz, UUID tenant_ID) {
		if (tenantCache.containsKey(clazz)) {
			UUID value = tenantCache.get(clazz);
			return ((value == null) ? tenant_ID : value);
		}
		
		EntityType entityType = clazz.getAnnotation(EntityType.class);
		if (entityType != null) {
			if (!orgCache.containsKey(clazz) && entityType.alwayRootOrg()) {
				orgCache.put(clazz, EO.ROOT_ID_VALUE);
			}
			if (!appCache.containsKey(clazz) && entityType.alwayRootApp()) {
				appCache.put(clazz, EO.ROOT_ID_VALUE);
			}
			
			if (entityType.alwayRootTenant()) {
				tenantCache.put(clazz, EO.ROOT_ID_VALUE);
				return EO.ROOT_ID_VALUE;
			}
		}
		
		if (!orgCache.containsKey(clazz))
			orgCache.put(clazz, null);
		if (!appCache.containsKey(clazz))
			appCache.put(clazz, null);
		
		tenantCache.put(clazz, null);
		return tenant_ID;
	}
	
	public static UUID getOrg_ID(Class<?> clazz, UUID org_ID) {
		if (orgCache.containsKey(clazz)) {
			UUID value = orgCache.get(clazz);
			return ((value == null) ? org_ID : value);
		}
		
		EntityType entityType = clazz.getAnnotation(EntityType.class);
		if (entityType != null) {
			if (!tenantCache.containsKey(clazz) && entityType.alwayRootTenant()) {
				tenantCache.put(clazz, EO.ROOT_ID_VALUE);
			}
			if (!appCache.containsKey(clazz) && entityType.alwayRootApp()) {
				appCache.put(clazz, EO.ROOT_ID_VALUE);
			}
			
			if (entityType.alwayRootOrg()) {
				orgCache.put(clazz, EO.ROOT_ID_VALUE);
				return EO.ROOT_ID_VALUE;
			}
		}
		
		if (!tenantCache.containsKey(clazz))
			tenantCache.put(clazz, null);
		if (!appCache.containsKey(clazz))
			appCache.put(clazz, null);
		
		orgCache.put(clazz, null);
		return org_ID;
	}
	
	public static UUID getApp_ID(Class<?> clazz, UUID app_ID) {
		if (appCache.containsKey(clazz)) {
			UUID value = appCache.get(clazz);
			return ((value == null) ? app_ID : value);
		}
		
		EntityType entityType = clazz.getAnnotation(EntityType.class);
		if (entityType != null) {
			if (!tenantCache.containsKey(clazz) && entityType.alwayRootTenant()) {
				tenantCache.put(clazz, EO.ROOT_ID_VALUE);
			}
			if (!orgCache.containsKey(clazz) && entityType.alwayRootOrg()) {
				orgCache.put(clazz, EO.ROOT_ID_VALUE);
			}
			
			if (entityType.alwayRootApp()) {
				appCache.put(clazz, EO.ROOT_ID_VALUE);
				return EO.ROOT_ID_VALUE;
			}
		}
		
		if (!tenantCache.containsKey(clazz))
			tenantCache.put(clazz, null);
		if (!orgCache.containsKey(clazz))
			orgCache.put(clazz, null);
		
		appCache.put(clazz, null);
		return app_ID;
	}
}
