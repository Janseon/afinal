package net.tsz.afinal.core;

import java.lang.ref.SoftReference;
import java.util.HashMap;

public class SoftMemoryCache<T> {

	private final HashMap<String, SoftReference<T>> mMemoryCache = new HashMap<String, SoftReference<T>>();

	public void put(String key, T value) {
		mMemoryCache.put(key, new SoftReference<T>(value));
	}

	public T get(String key) {
		SoftReference<T> memValue = mMemoryCache.get(key);
		if (memValue != null) {
			return memValue.get();
		}
		return null;
	}

	public void evictAll() {
		mMemoryCache.clear();
	}

	public void remove(String key) {
		mMemoryCache.remove(key);
	}

}
