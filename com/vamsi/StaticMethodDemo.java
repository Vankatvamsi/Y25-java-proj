package com.vamsi;
class Sample2
{
	static void sum()
	{
		int a=10,b=20,result;
		result=a+b;
		System.out.println("result of addition="+result);
	}
	static int sub()
	{
		int a=10,b=6,result;
		result=a-b;
		return result;
	}
	static int mul(int x, int y)
	{
		int result;
		int a=x;
		int b=y;
		result=a*b;
		return result;
	}
}
public class StaticMethodDemo {

	public static void main(String[] args)
	{
		Sample2.sum();
		int result=Sample2.sub();
		System.out.println("result of sub:"+result);
		int result1=Sample2.mul(5, 7);
		System.out.println("result of mul:"+result1);

	}

}

