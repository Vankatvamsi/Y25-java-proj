package com.collection;

import java.util.Vector;

public class VectorImplementation {

	public static void main(String[] args) {
		Vector<String> v1 =new Vector<String>();
		v1.add("Ramu");
		
		v1.add("anu");
		v1.add(null);
		v1.add(2, "Mahi");
		v1.addFirst("Balu");
		System.out.println("Object elements are:"+v1);
		v1.add(2, "balaya");
		System.out.println("Object elements are:"+v1);
		System.out.println(v1.get(2));
		v1.remove(2);
		System.out.println("Object elements are:"+v1);
		System.out.println(v1.get(2));
		
		

	}

}
