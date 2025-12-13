package com.vamsi;

import java.util.Scanner;

class Sample3
{
	int n1,n2;
	void swap2(Sample3 obj)
	{
		int temp;
		temp=obj.n1;
		obj.n1=obj.n2;
		obj.n2=temp;
	}
}
public class CallByObject 
{

	public static void main(String[] args) 
	{
		Sample3 obj=new Sample3();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter first number");
		obj.n1=s1.nextInt();
		System.out.println("Enter second number");
		obj.n2=s1.nextInt();
		System.out.println("Before swap:"+obj.n1+" "+obj.n2);
		obj.swap2(obj);
		System.out.println("After swap:"+obj.n1+" "+obj.n2);
	}

}
