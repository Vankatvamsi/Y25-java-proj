package com.collection;
import java.util.HashMap;
import java.util.Map;
public class HashMapImpl 
{
	public static void main(String[] args) 
	{	
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		hm.put(1, 50);
		hm.put(2, 500);
		hm.put(8, 505);
		hm.put(9, 600);
		hm.put(7, 506);
		hm.put(4, 50);
		System.out.println("Map elements are: "+hm);
		System.out.println("get keys from map object: "+hm.keySet());
		System.out.println("get values from map object: "+hm.values());
		//Retrieve elements from map objects
		System.out.println("HashMap values are: ");
		for(Map.Entry<Integer, Integer> m:hm.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}

}
