package com.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListImpl {

	public static void main(String[] args) {
		LinkedList<String> fr= new LinkedList<String>();
		fr.add("banana");
		fr.add("apple");
		fr.add(null);
		fr.add("orange");
		fr.add("grapes");
		fr.add("mango");
		fr.addFirst("Sapota");
		fr.addLast("grapes");
		fr.removeFirst();
		fr.removeLast();
		System.out.println("Get first element:"+fr.getFirst());
		System.out.println("Get last element:"+fr.getLast());
		
		System.out.println("fruit names are:");
		//forward
		Iterator<String> i1=fr.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		//Backward
		System.out.println("Object elements from last to first");
		
		while(((ListIterator<String>) i1).hasPrevious()) {
			System.out.println(((ListIterator<String>) i1).previous());
		}
	}
		
	}


