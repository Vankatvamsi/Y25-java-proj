package com.vamsi;
abstract class Area
{
	String name;
	Area(String name)
	{
		this.name=name;
	}
	//display method implemented(concrete method)
	void display()
	{
		System.out.println("implementation of abstract classes");
		System.out.println("I am "+this.name);
	}
	//method not implemented it is called as abstract method
	abstract void area();
}
class Rectangle extends Area
{
	Rectangle(String name)
	{
		super(name);
	}
	@Override
	void area() 
	{
		int l=10;
		int b=20;
		System.out.println("Area of rectangle: "+(l*b));
	}
	void display2()
	{
		System.out.println("it is subclass member");
	}
}
class Trangle extends Area
{

	Trangle(String name)
	{
		super(name);
	}
	@Override
	void area() 
	{
		int b=10;
		int h=20;
		System.out.println("Area of trangle: "+(0.5*b*h));
	}
	
}


public class AbstractClassImplement 
{
	public static void main(String[] args) 
	{
		//create reference variable
		Area obj;
		Rectangle obj1=new Rectangle("Balu");
		obj=obj1;
		obj.display();
		obj.area();
		obj1.display2();
		
		Trangle obj2=new Trangle("Ramu");
		obj=obj2;
		obj.display();
		obj.area();
	}

}
