package com.vamsi;
class Emp5{
	void display() {
		System.out.println("object equals method");
	}
}
public class ObjectEqualsMethodImp {
	

	public static void main(String[] args) {
		Emp5 e1=new Emp5();
		Emp5 e2=new Emp5();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		if (e1.equals(e2))
		{
			System.out.println("e1 and e2 are equal");
		}
		else {
			System.out.println("e1 and e2 are not equal");
		}
		if(i1.equals(i2)) {
			System.out.println("i1 and i2 are equal");
		}
		else {
			System.out.println("i1 and i2 are not equal");
		

	}
	}}

