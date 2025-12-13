package com.vamsi;
class Sample2
{
		static void sum()
		{
			int a=10,b=20,result;
			result=a+b;
			System.out.println("Result of Addition="+result);
		}
		static int sub()
		{
			int a=10,b=6,result;
			result=a-b;
			return result;
		}
		static int mul(int x,int y)
		{
			int a,b,result;
			a=x;
			b=y;
			result=a*b;
			return result;
		}
}
public class StaticMethods 
{
	public static void main(String[] args)
	{
		Sample2.sum();
		int result=Sample2.sub();
		System.out.println("Result of Substraction="+result);
		int result2=Sample2.mul(8, 6);
		System.out.println("Result of Multiplication="+result2);
	}
}
