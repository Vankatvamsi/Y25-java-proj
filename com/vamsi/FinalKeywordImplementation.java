package com.vamsi;
class A
{
	 void display()
	{
		System.out.println("it is a final method");
	}
}
class B extends A
{
	void display2()
	{
		System.out.println("it  is non final method");
	}
}
public class FinalKeywordImplementation 
{

	public static void main(String[] args) 
	{
		B b1=new B();
		b1.display();
		b1.display2();
	}

}
