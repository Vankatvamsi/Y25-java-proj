package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {

	public static void main(String[] args) {
	HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
	hm.put(1, 50);
	hm.put(2, 500);
	hm.put(3, 100);
	hm.put(4, 600);
	hm.put(7, 500);
	hm.put(5, 75);
	System.out.println("map element are:"+hm);
	System.out.println("get keys from map:"+hm.keySet());
	System.out.println("get values from map:"+hm.values());
	//Retrieve elements from map object
	System.out.println("hashmap elements are");
	for(Map.Entry<Integer, Integer> m:hm.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}

	

	}

}
