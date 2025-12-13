package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImpl 
{
	public static void main(String[] args) 
	{
		ArrayList<Double> al=new ArrayList<Double>();
		System.out.println("Employees salaries are");
		al.add(10.56);
		al.addLast(56.89);
		al.add(100.56);
		al.add(10.56);
		al.add(null);
		al.add(200.56);
		al.add(105.26);
		al.add(3 , 20.56);
		System.out.println(al.contains(10.56));
		Iterator<Double> d=al.iterator();
		System.out.println("object elements are: ");
		while(d.hasNext())
		{
			System.out.println(d.next());
		}
		al.removeFirst();
		al.removeLast();
		System.out.println("size of an object: "+al.size());
		al.set(3, 7.89);
		System.out.println("get element at: "+al.get(1));
		System.out.println("get object element: "+al.get(3));
		System.out.println(" object elements after remove the objects : ");
		Iterator<Double> d1=al.iterator();
		while(d1.hasNext())
		{
			System.out.println(d1.next());
		}
		System.out.println("element available at: "+"\t"+al.indexOf(200.56));
		System.out.println("element available at: "+"\t"+al.lastIndexOf(10.56));
	}

}
