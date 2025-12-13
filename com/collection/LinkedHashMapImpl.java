package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapImpl 
{

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String> lm=new LinkedHashMap<Integer, String>();
		lm.put(1, "anu");
		lm.put(2, "balu");
		lm.put(3, "ramu");
		lm.put(4, "balayya");
		lm.put(5, "ramya");
		lm.put(6, "babu");
		System.out.println(" elements are: "+lm);
		lm.remove(3);
		System.out.println(" elements are: "+lm);
		//Retrieve elements
		for(Map.Entry<Integer, String> l:lm.entrySet())
		{
			System.out.println(l.getKey()+"\t"+l.getValue());
		}
	}

}
