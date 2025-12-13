package com.vamsi;
class Calc
{
	void calc(int x)
	{
		System.out.println("square of x="+(x*x));
	}
}
class Calc2 extends Calc
{
	void calc(int x)
	{
		System.out.println("squareroot of x="+Math.sqrt(x));
	}
}
public class DynamicPolyImplement 
{
	public static void main(String[] args) 
	{
		Calc2 obj1=new Calc2();
		obj1.calc(25);
	}

}
