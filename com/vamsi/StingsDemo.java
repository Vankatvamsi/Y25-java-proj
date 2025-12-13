package com.vamsi;

public class StingsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Ramya";
		String s2="Krishna";
		char ch[]={'a','n','u'};
		String s3=new String(ch);
		String s4=new String("Balu");
		System.out.println("First String is:"+s1);
		System.out.println("Second String is:"+s2);
		System.out.println("Third String is:"+s3);
		System.out.println("Fourth String is:"+s4);
		System.out.println("Concatation of Strings:"+s1.concat(s4));
		System.out.println("substring of Strings:"+s1.substring(0,3));
		if(s1.equals(s3))
		{
			System.out.println("Two strings are not equal");
		}
		else
		{
			System.out.println("two strings are not equal");
		}
		if(s1.compareTo(s3)==0)
		{
			System.out.println("Two strings are not equal");
		}
		else if(s1.compareTo(s2)>0)
		{
			System.out.println("s1 is bigger than s2");
		}
		else
		{
			System.out.println("s1 is smaller than s2");
		}
		System.out.println("index of the strings"+s1.indexOf("a"));
		System.out.println("last index of the string"+s1.lastIndexOf("a"));
		System.out.println("upperclase"+s1.toUpperCase());
		System.out.println("lowercase"+s2.toLowerCase());
	}

}
