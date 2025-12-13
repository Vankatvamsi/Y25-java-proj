package com.vamsi;

import java.util.Scanner;

public class RecursiveMethod
{
	static long factorial(long n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
		return n*factorial(n-1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number we want to find the factorial:");
		long n=s1.nextLong();
		long result=factorial(n);
		System.out.println("Factorial of "+n+" is:"+result);
	}

}
