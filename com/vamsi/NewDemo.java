package com.vamsi;
class Sample
{
	int a=10;
	String name="Balaya";
	void display()
	{
		System.out.println("a value="+a);
		System.out.println("Name="+name);
		
	}
}
public class NewDemo {

	public static void main(String[] args)
	{
	 Sample S1=new Sample();
	 S1.display();

	 System.out.println(S1 instanceof Sample);
	}

}
