package com.vamsi;
public class MethodArray 
{
	static void display(int a[])
	{
		System.out.println("Array elements Are:");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		MethodArray.display(a);
	}
}