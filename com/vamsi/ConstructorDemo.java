package com.vamsi;
class Employee
{
	String name;
	int age;
	double salary;
	//default constructor
	Employee()
	{
		System.out.println("this is default constructor");
		System.out.println("name is :"+this.name);
		System.out.println("age is :"+this.age);
		System.out.println("salary is :"+this.salary);
		this.display();
		
	}
	Employee(String name,int age, double salary)
	{
		//leftside is instance variable-object
		//rightside is parameter
	 this.name=name;
	this.age=age;
	 this.salary=salary;
	 
	}
	void display()
	{
		System.out.println("name is :"+this.name);
		System.out.println("age is :"+this.age);
		System.out.println("salary is :"+this.salary);
		
		
	}
}
public class ConstructorDemo {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.display();
		Employee e2=new Employee("balaya",62,100000.23);
		e2.display();
		Employee e3=new Employee();
		e3.display();
		

	}

}
