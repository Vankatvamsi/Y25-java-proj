package com.vamsi;
class Sample1
{
	void sum()
	{
		int a=10,b=20,result;
		result=a+b;
		System.out.println("result of addition="+result);
	}
	int sub()
	{
		int a=10,b=6,result;
		result=a-b;
		return result;
	}
	int mul(int x, int y)
	{
		int result;
		int a=x;
		int b=y;
		result=a*b;
		return result;
	}
}

public class InstanceMethodDemo {

	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		s1.sum();
		int result=s1.sub();
		System.out.println("Sub Result:"+result);
		int result1=s1.mul(10, 12);
		System.out.println("result of mul:"+result1);

	}

}

