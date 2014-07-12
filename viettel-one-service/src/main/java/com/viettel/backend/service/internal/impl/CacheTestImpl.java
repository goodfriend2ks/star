package com.viettel.backend.service.internal.impl;


import java.util.Random;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.viettel.backend.service.CacheTestService;


@Service(value = "cacheTestService")
public class CacheTestImpl implements CacheTestService  {
	private Random rand = new Random();

	@Cacheable("test2")
	@Override
	public int test2(int k) {
		int aa = rand.nextInt();
		 System.out.println("gia tri: " + aa);
		 return aa;
	}
	
	@Override
	@Cacheable(value="test")
	public int test() {
		int aa = rand.nextInt();
		 System.out.println("gia tri: " + aa);
		 return aa;
	}

	
	//@Cacheable("test")
	

}
