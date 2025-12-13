package com.vamsi;
class Sample
{
	int a=10;
	String name="Vamsi";
	void Display()
	{
		System.out.println("a value:"+a);
		System.out.println("Name:"+name);
	}
}
public class NewDemo 
{

	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		s1.Display();
		System.out.println(s1 instanceof Sample);

	}

}
