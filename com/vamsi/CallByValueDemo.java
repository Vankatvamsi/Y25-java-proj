package com.vamsi;

import java.util.Scanner;

class SampleCall
{
	void swap(int num1, int num2)
	{
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
	}

}
public class CallByValueDemo {

	public static void main(String[] args) 
	{
		int num1, num2;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter first no:");
		num1=s1.nextInt();
		System.out.println("Enter second no:");
		num2=s1.nextInt();
		System.out.println("values before swapping:");
		System.out.println("num1:"+num1+"\t"+"num2:"+num2);
		SampleCall sc=new SampleCall();
		sc.swap(num1, num2);
		System.out.println("after swap");
		System.out.println("num1:"+num1+"\t"+"num1:"+num2);
				
		
	}

}
