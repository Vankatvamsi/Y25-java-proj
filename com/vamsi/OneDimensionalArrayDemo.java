package com.vamsi;

import java.util.Scanner;

public class OneDimensionalArrayDemo {

	public static void main(String[] args) 
	{
		int a[]={10,20,30,40,50};
		int n;
		System.out.println("Array elements are:");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("array element with loop:");
		for(int i=0;i<a.length;i++)
		{
			/*if(i==3)
			{
				System.exit(0);
			}*/
		System.out.println(a[i]);
		}System.out.println("out of loop");
		//array creation with new operator
		int[] b=new int[] {100,200,300,400,500};
		// access array element using loop
		for(int i=0;i<b.length;i++)
		{
		System.out.println(b[i]);
		}System.out.println("out of loop");
		
		//another way for creating array using new operator
		int c[]=new int[5];
		c[0]=5;
		c[1]=15;
		for(int i=0;i<c.length;i++)
		{
		System.out.println(c[i]);
		}System.out.println("out of loop");
		System.out.println("using for each mehthod");
		 for(int x:a) // a is array and x is loop variable.
			{
				System.out.println(x);
			}
		 //read an array elements from keyboard.
		 System.out.println("Enter size of array we want:");
		 Scanner s1=new Scanner(System.in);
		 n=s1.nextInt();
		 System.out.println("enter Array elements:");
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("Enter" +"\t"+ (i+1)+"\t"+"	 element");
			 a[i]=s1.nextInt();
			 }
		 System.out.println("Array elements are");
		 for(int i=0;i<n;i++)
		 {
			 System.out.println(a[i]);
		 }
		 System.out.println("out of loop");

				
	}

}
