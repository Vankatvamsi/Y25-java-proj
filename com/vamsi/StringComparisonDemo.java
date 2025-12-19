package com.vamsi;

public class StringComparisonDemo {

	public static void main(String[] args)
	{
		String s1="Hello";
		String s2=new String("Hello");//
		if(s1==s2)
		{
			System.out.println("two strings are equal");
		}
		else
		{
			System.out.println("two strings are not equal");
		}

	}

}
