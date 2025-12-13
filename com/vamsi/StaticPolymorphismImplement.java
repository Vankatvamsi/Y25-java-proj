package com.vamsi;
class Staticpoly
{
	int sum(int a,int b)
	{
		return(a+b);
	}
	int sum(int a,int b,int c)
	{
		return(a+b+c);
	}
	double sum(double a,double b)
	{
		return(a+b);
	}
}
public class StaticPolymorphismImplement 
{
	public static void main(String[] args) 
	{
		Staticpoly sp=new Staticpoly();
		int result1 = sp.sum(10, 20);
		System.out.println("addition:"+result1);
		int result2 = sp.sum(10, 20, 30);
		System.out.println("addition:"+result2);
		double result3 = sp.sum(10.56, 20.59);
		System.out.println("addition:"+result3);
	}
	
}
