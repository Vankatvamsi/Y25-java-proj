package com.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetImpl 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		lh.add("Iliyana");
		lh.add("Minakhsi");
		lh.add("Mahesh");
		lh.add(null);
		lh.add("Dualipa");
		lh.add("Balayya");
		lh.add("Prabas");
		lh.remove("Balayya");
		for(String s:lh)
		{
			System.out.println(s);
		}
		System.out.println(lh.contains("Balayya"));
		System.out.println("size of object:"+lh.size());
	}

}
