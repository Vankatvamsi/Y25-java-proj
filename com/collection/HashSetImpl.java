package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImpl {
	public static void main(String[] args) {
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(200);
		h1.add(5000);
		h1.add(null);
		System.out.println("collection  element are:"+h1);
		System.out.println("added  element  are:"+h1.hashCode());
		System.out.println("collection  element is empty:"+h1.isEmpty());
		System.out.println("check element available or not:"+h1.contains(20));
		System.out.println("check element available or not:"+h1.contains(200));
		h1.remove(20);
		//traversing by iterator
		Iterator<Integer> i1=h1.iterator();
		/*for(int i:h1) {
			System.out.println(i);
		}*/
		while(i1.hasNext()) {
		System.err.println(+i1.next());
		}
		System.out.println("size of object:"+h1.size());
		System.out.println("Address of object:"+h1.hashCode());
		
			
	}

}
