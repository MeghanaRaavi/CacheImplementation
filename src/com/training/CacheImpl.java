package com.training;

import java.util.HashMap;


public class CacheImpl<K, V> implements CacheInterface<K,V>{
	 
	 HashMap<K,V> map=new HashMap<K,V>();
     

	@Override
	public void put(K key, V value) {
		// TODO Auto-generated method stub
		map.put(key, value);
	}



	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		return map.get(key);
	}



	@Override
	public void invalidate(K key) {
		// TODO Auto-generated method stub
	  map.remove(key);
	}



	@Override
	public long size() {
		// TODO Auto-generated method stub
		return map.size();
	}

	

}