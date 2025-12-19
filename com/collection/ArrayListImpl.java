package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListImpl {
	public static void main(String[] args) throws Exception {
		ArrayList<Double> al =new ArrayList<Double>();
		System.out.println("Employee salaries are:");
		al.add(10.56);
		al.add(1, 20.56);
		//al.addLast(10.89);
		al.add(10.56);
		al.add(100.56);
		al.add(null);
		al.add(105.56);
		System.out.println(al.contains(10.56));
		Iterator<Double> d=al.iterator();
		System.out.println("object elements are:");
		while(d.hasNext()) {
			System.out.println(d.next());
		}
		System.out.println("element available at:"+" "+al.indexOf(10.56));
		System.out.println("element available at last :"+al.lastIndexOf(10.56));
		al.remove(2);
		System.out.println("size of object:"+al.size());
		al.set(3, 7.89);
		System.out.println("get object element:"+al.get(3));
		System.out.println("object elements are:");
		Iterator<Double> d1=al.iterator();
		while(d1.hasNext()) {
			System.out.println(d1.next());
		}
		
		
		
	}

}
