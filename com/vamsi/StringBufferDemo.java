package com.vamsi;

public class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		String s1="Problem Solving";
		String s2="using programming java";
		StringBuffer sb1=new StringBuffer(s1);
		StringBuilder sb2=new StringBuilder(s2);
		System.out.println("First String:"+s1);
		System.out.println("Second String:"+s2);
		System.out.println("Stringbuffer:"+sb1);
		System.out.println("StringBuilder :"+sb2);
		System.out.println("length of sb1:"+sb2.length());
		System.out.println("appending of sb1:"+sb2.append(sb1));
		System.out.println("insert of sb objects:"+sb2.insert(8, "through "));
		System.out.println("reverse of sb objects:"+sb2.reverse());
		System.out.println("Deletion of sb objects:"+sb2.delete(3, 9));
		System.out.println(sb1.toString());
	}
}
