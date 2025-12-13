package com.collection;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListImpl 
{

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("banana");
		ll.add("apple");
		ll.add(null);
		ll.add("orange");
		ll.add("grapes");
		ll.add("mango");
		ll.add("orange");
		ll.addFirst("Strawberry");
		ll.removeFirst();
		ll.removeLast();
		System.out.println("get first element:"+ll.getFirst());
		System.out.println("get last element:"+ll.getLast());
		System.out.println("fruit names are: ");
		//forward
		System.out.println("object elements from first to last");
		Iterator<String> i1=ll.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		//backward
		System.out.println("object elements from last to first");
		while(((ListIterator<String>) i1).hasPrevious())
		{
			System.out.println(((ListIterator<String>) i1).previous());
		}
	}

}
