package com.training;



public class Cache {

	public static <K, V> void main(String[] args) {
		// TODO Auto-generated method stub
 CacheImpl<Integer, String> a =new CacheImpl<Integer, String>();
        a.put(3,"String");
        a.put(2,"int");
        a.put(4, "value");
        a.put(5, "five");
        System.out.println("Size Of Cache :: " + a.size());
        a.invalidate(3);
      	System.out.println("Check for key in Cache :: " +  a.get(3));
    
	}

}
