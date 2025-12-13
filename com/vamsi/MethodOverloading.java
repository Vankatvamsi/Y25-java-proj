package com.vamsi;
class Operation
{
	int sum()
	{
		int a=10,b=20;
		return(a+b);
	}
	int sum(int a, int b)
	{
		return(a+b);
	}
	int sum(int a, int b, int c)
	{
		return(a+b+c);
	}
}
public class MethodOverloading 
{
	public static void main(String[] args) 
	{
		Operation ab=new Operation();
		System.out.println("Addition:"+ab.sum());
		System.out.println("Addition with two parameters:"+ab.sum(5, 13));
		System.out.println("Addition with three parameters:"+ab.sum(5, 15, 48));
		
	}

}
