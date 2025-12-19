package com.vamsi;
class One
{
	int i1=10;
	One()
	{
		System.out.println("It is superclass default cinstructor");
		System.out.println("superclass variable:"+this.i1);
	}
	One(int i1)
	{
		this.i1=i1;	
	}
	void display()
	{
		System.out.println("super class variable:"+this.i1);
	}
}
class Two extends One
{
	int i2=100;
	Two()
	{
		super(200);
		System.out.println("It is subclass default cinstructor");
		System.out.println("subclass variable:"+this.i2);
		System.out.println("super variable:"+super.i1);
		super.display();
	}
	Two(int i2)
	{
		//access super class default constructor
		super(200);				
		this.i2=i2;
	}
	
}
public class InheritanceConstructor {

	public static void main(String[] args) {
		Two t1=new Two();
		
		

	}

}
