package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImpl 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(16);
		h1.add(20);
		h1.add(30);
		h1.add(16);
		h1.add(89);
		h1.add(48);
		h1.add(146);
		h1.add(145);
		h1.add(null);
		System.out.println("Collection elements are: "+h1);
		System.out.println("collection objects is empty "+h1.isEmpty());
		System.out.println("check element 20 is available or not: "+h1.contains(20));
		System.out.println("check element 20 is available or not: "+h1.contains(200));
		h1.remove(20);
		//traversing by iterator
		Iterator<Integer> i1=h1.iterator();
		/*for(int i:h1)
		{
			System.out.print(i+" ");
		}*/
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("size of objects:"+h1.size());
		System.out.println("address of object"+h1.hashCode());
	}
}
