package com.vamsi;

public class Relational 
{

	public static void main(String[] args) 
	{
		int a=10,b=20;
		b=a>>2;
		System.out.println("b="+b);
		b=a<<2;
		System.out.println("b="+b);
		int result = (a>b)?30:20;
		System.out.println(result);
       System.out.println("Result of < is:"+(a<b));
       System.out.println("Result of <= is:"+(a<=b));
       System.out.println("Result of > is:"+(a>b));
       System.out.println("Result of >= is:"+(a>=b));
       System.out.println("Result of == is:"+(a==b));
       System.out.println("Result of != is:"+(a!=b));
	}

}
