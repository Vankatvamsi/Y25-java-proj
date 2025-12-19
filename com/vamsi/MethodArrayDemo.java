package com.vamsi;
public class MethodArrayDemo
{	
		static void display(int a[])
		{
			//print array element
			System.out.println("Array elements are:");
			
			for(int i=0;i<5;i++)
			{
				System.out.println(a[i]);
			}
		}

		public static void main(String[] args) 
		{
			int a[]= {10,20,30,40,50};
			MethodArrayDemo.display(a);
		}


	
	}

	
