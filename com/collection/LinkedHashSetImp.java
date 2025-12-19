package com.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetImp {

	public static void main(String[] args) {
	LinkedHashSet<String> lh= new LinkedHashSet<String>();
	System.out.println("Actor Names are:");
	lh.add("Illiana");
	lh.add("Minakshi");
	lh.add("Samantha");
	lh.add("Dualipa");
	lh.add("Balaya");
	lh.add("Prabhash");
	lh.add(null);
	lh.remove("Balaya");
	for(String s:lh) {
		System.out.println(s);
	}
	System.out.println(lh.contains("Balaya"));
	System.out.println("size of object:"+lh.size());
	}

}
