package com.training;

public interface CacheInterface<K, V>   
{  
    public void put(K key, V value);  
    public V get(K key); 
    public void invalidate(K key);
    public long size();
}  