package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapImpl {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lm=new LinkedHashMap<Integer, String>();
		lm.put(10, "anu");
		lm.put(2, "anu1");
		lm.put(3, "anu");
		lm.put(8, "anu2");
		lm.put(5, "anu");
		lm.put(6, "anu3");
		System.out.println("Elemints are :"+lm);
		lm.remove(3);
		System.out.println("Elemints are :"+lm);
		//Retrieve element
		for(Map.Entry<Integer, String> m:lm.entrySet())
		{
			System.out.println(m.getKey());
		}
		

	}

}
