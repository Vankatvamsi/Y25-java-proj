package com.vamsi;
public class ExceptionHandlingImpl 
{

	public static void main(String[] args) 
	{
		int a=10,b;
		System.out.println("open file");
		System.out.println("a="+a);
		try
		{
			b=a/0;
			System.out.println("b="+b);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("divide num by zero is invalid");
		}
		try
		{
			int s[]=new int[]{10,20,30};
			s[5]=100;
			System.out.println(s[5]);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
			System.out.println("acessing element using out of index is invalid ");
		}
		finally
		{
			System.out.println("close file");
		}
	}
}