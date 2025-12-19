package com.vamsi;
class Demo2
{
	int a=10;
	static int b=10;
	
}

public class StaticVariableAndInstanceVariableDemo {

	public static void main(String[] args)
	{
		Demo2 d1=new Demo2();
		Demo2 d2=new Demo2();
		//instance variable
		System.out.println("instance variable");
		
		d1.a++;
		System.out.println(d1.a);
		System.out.println(d2.a);
		//static variable
		System.out.println("static variable");
		d1.b++;
		System.out.println(d1.b);
		System.out.println(d2.b);
		
				
		
		

	}

}
