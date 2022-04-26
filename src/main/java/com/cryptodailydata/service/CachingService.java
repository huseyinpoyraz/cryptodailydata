package com.cryptodailydata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

/**
 * @author ibrahim.karadag at 27.01.2020
 */
@Component
public class CachingService
{
	@Autowired
    CacheManager cacheManager;

	public void evictAllCaches() {
		cacheManager.getCacheNames().stream()
				.forEach(cacheName -> cacheManager.getCache(cacheName).clear());
	}

	public void evictAllCacheValues(String cacheName) {
		cacheManager.getCache(cacheName).clear();
	}
}
