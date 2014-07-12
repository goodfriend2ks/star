package com.viettel.backend.service.internal.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.stereotype.Service;

import com.viettel.backend.service.CacheManagerService;

/**
 * @author haind25
 * ham nay muc dich chinh la de reset cache cua ehcache, ke thua
 * tu EhCacheCacheManager. Vi vay dat hau to la Impl thi ko hop ly lam. 
 * Tam thoi dat ten la: CacheManagerExt (Extend)
 * 
 * */

@Service(value = "cacheManagerService")
public class CacheManagerExt extends EhCacheCacheManager implements CacheManagerService{

	public CacheManagerExt() {
		super();
	}

	@Autowired
	public CacheManagerExt(net.sf.ehcache.CacheManager cacheManager) {
		super(cacheManager);
	}

	@Override
	public void resetAllCache() {
		Collection<String> names = getCacheNames();
		for (String name : names) {
			getCacheManager().getCache(name).removeAll();
		}
	}
	
}
