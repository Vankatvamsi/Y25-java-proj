package com.vamsi;
class A{
	final void display()
	{
		System.out.println("It is final method.");
		
	}
}
class B extends A{
	void display2()
{
		System.out.println("It is not final method.");
		}
}
public class FinalKeywordImplementation {

	public static void main(String[] args) {
		B b1=new B();
		b1.display();
		b1.display2();

	}

}
