package com.vamsi;

import java.util.Scanner;

public class OneDarray
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,45,58,69};
		//array elements without loops
		System.out.println("Array Elements are:"+a[0]);
		System.out.println("Array Elements are:"+a[1]);
		System.out.println("Array Elements are:"+a[2]);
		System.out.println("Array Elements are:"+a[3]);
		System.out.println("Array Elements are:"+a[4]);
	System.out.println("Array with loops");
	for(int i=0;i<a.length;i++)
	{
		
		System.out.println(a[i]);
	}
	System.out.println("Array with loops for array b");
	int[] b= new int[]{10,20,30,40,50};
	for(int i=0;i<a.length;i++)
	{
		System.out.println(b[i]);
	}
	int[] c=new int[5];
	c[0]=5;
	c[3]=8;
	System.out.println("array elements with default value");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(c[i]);
	}
	
	//accesing of array elements using for each loop
	System.out.println("accesing of array elements using for each loop");
	for(int x:a)
	{
		System.out.println(x);
	}
	//read an array elements from keyboard
	System.out.println("Enter no of elements we want");
	Scanner s5 =new Scanner(System.in);
	int n=s5.nextInt();
	for(int i=0;i<n;i++)
	{
	System.out.println("Enter a["+i+"] element");
	a[i]=s5.nextInt();
	}
	System.out.println("Array elements are");
	for(int j=0;j<n;j++)
	{
		System.out.println(a[j]);
	}
	System.out.println("end of loop");
	}

}
