package com.vamsi;

public class StringClassDemo {

	public static void main(String[] args) 
	{
		String s1="Ramya";
		String s2="Krishna";
		char ch[]= {'r','a','j','u'};
		String s3=new String(ch);
		String s4=new String("balu");
		System.out.println("First String is:"+s1);
		System.out.println("Second String is:"+s2);
		System.out.println("Third String is:"+s3);
		System.out.println("Fourth String is:"+s4);
		System.out.println("Concatnation of strings:"+s1.concat(s2));
		System.out.println("Substring of string:"+s2.substring(0));
		System.out.println("Substring of string:"+s2.substring(0,3));// 0 to n-1
		if(s1.equals(s2)) {
		System.out.println("two strings are equal");
		}
		else
		{
			System.out.println("two strings are not equal");
		}
		if(s1.compareTo(s3)==0)
		{
			System.out.println("two strings are equal");
		}
		else if(s1.compareTo(s3)>0)
		{
			System.out.println("s1>s2");
		}
		else
		{
			System.out.println("s1<s2");
		}
		System.out.println("index of strings"+s1.indexOf("a"));
		System.out.println("index of strings"+s1.lastIndexOf("a"));
		System.out.println("String Uppercase:"+s1.toUpperCase());
		System.out.println("to Uppercase:"+s1.toUpperCase());
		System.out.println("length of s1:"+s1.length());
		System.out.println("Substring of string:"+s2.substring(0,3));

	}

}
