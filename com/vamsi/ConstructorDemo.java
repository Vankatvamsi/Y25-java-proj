package com.vamsi;
class Emp
{
	String name="Worst Response";
	int age=48;
	double sal=1.234;
	//default constructor
	Emp()
	{
		System.out.println("this is default constructor");
		System.out.println("name is:"+name);
		System.out.println("age is:"+age);
		System.out.println("salary is:"+sal);
	}
	//Parameterized Constructor
	Emp(String name, int age, double sal)
	{
		this.name=name;
		this.age=age;
		this.sal=sal;
		System.out.println("name is:"+this.name);
		System.out.println("age is:"+this.age);
		System.out.println("salary is:"+this.sal); 
		this.display();
	}
	void display()
	{		
		System.out.println("name is:"+this.name);
		System.out.println("age is:"+this.age);
		System.out.println("salary is:"+this.sal);
	}
}
public class ConstructorDemo 
{
	public static void main(String[] args)
	{
		Emp e1=new Emp();
		Emp e2=new Emp("Balaiyya",62,1452364.154);
		
	}

}
