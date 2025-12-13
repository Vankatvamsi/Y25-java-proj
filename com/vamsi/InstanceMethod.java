package com.vamsi;
class Sample1
{
		void sum()
		{
			int a=10,b=20,result;
			result=a+b;
			System.out.println("Addition result="+result);
		}
		int sub()
		{
			int a=10,b=6,result;
			result=a-b;
			return result;
		}
		int mul(int x,int y)
		{
			int a,b,result;
			a=x;
			b=y;
			result=a*b;
			return result;
		}
}
public class InstanceMethod
{
	public static void main(String[] args)
	{
		Sample1 ab= new Sample1();
		ab.sum();
		int result=ab.sub();
		System.out.println("Substraction result="+result);
		int result1=ab.mul(5, 8);
		System.out.println("Multiplication result="+result1);
	}

}
