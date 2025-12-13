package com.vamsi;

public class StaticBlockDemo 
{
	void display()
	{
		System.out.println("It is instance method 1");
	}
	static 
	{
		System.out.println("it is static block 1");
	}
	public static void main(String[] args) 
	{
		System.out.println("it is static method 1");
		StaticBlockDemo sd=new StaticBlockDemo();
		sd.display();
		sd.display2();
		StaticBlockDemo.display3();
	}
	void display2()
	{
		System.out.println("It is instance method 2");
	}
	static 
	{
		System.out.println("it is static block 2");
	}
	static void display3()
	{
		System.out.println("It is instance method 2");
	}

}
