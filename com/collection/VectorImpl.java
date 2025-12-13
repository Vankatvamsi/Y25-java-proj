package com.collection;

import java.util.Vector;

public class VectorImpl 
{

	public static void main(String[] args) 
	{
		Vector<String> v1=new Vector<String>();
		v1.add("Ramu");
		v1.add("Anu");
		v1.add(null);
		v1.add(null);
		v1.add(2,"Mahi");
		v1.add(1, "raju");
		System.out.println("object elements are:"+v1);
		v1.set(2, "balayya");
		System.out.println("object elements are:"+v1);
		System.out.println("get element: "+v1.get(2));
		v1.remove(2);
		System.out.println("get element: "+v1.get(2));
		System.out.println("object elements are:"+v1);
	}

}
