package com.vamsi;
public class StringBufferClassDemo {

	public static void main(String[] args) 
	{
		String s1="problem Solving";
		String s2="through programming Java";
		StringBuffer sb1=new StringBuffer(s1);
		StringBuilder sb2=new StringBuilder(s2);
		System.out.println("first String:"+s1);
		System.out.println("second String"+s2);
		System.out.println("stringBuffer:"+sb1);
		System.out.println("StringBuilder"+sb2);
		System.out.println("length sb1:"+sb1.length());
		System.out.println("appending of sb1:"+sb1.append(sb2));
		System.out.println("insert of sb1 object:"+sb1.insert(8,"through"));
		System.out.println("reverse of sb1:"+sb1.reverse());
		System.out.println("delete sb1:"+sb1.delete(3, 9));
		System.out.println(sb1.toString());//converted StringBuffer into string.....
		
		

	}

}
