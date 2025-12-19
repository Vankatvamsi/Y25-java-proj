package com.vamsi;

import java.util.Scanner;

class SampleObject
{
	int num1, num2;
	void swap2(SampleObject obj1)
	{	
		int temp;
		temp=obj1.num1;
		obj1.num1=obj1.num2;
		obj1.num2=temp;
	}

}
public class CallByObjectDemo {

	public static void main(String[] args)
	{
		SampleObject obj1=new SampleObject();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter first no:");
		obj1.num1=s1.nextInt();
		System.out.println("Enter second no:");
		obj1.num2=s1.nextInt();
		System.out.println("values before swapping:");
		System.out.println("num1:"+obj1.num1+"\t"+"num2:"+obj1.num2);
		obj1.swap2(obj1);
		System.out.println("after swap");
		System.out.println("num1:"+obj1.num1+"\t"+"num2:"+obj1.num2);
		

	}

}
