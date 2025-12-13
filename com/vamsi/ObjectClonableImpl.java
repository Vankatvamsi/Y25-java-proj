package com.vamsi;
class emp1 implements Cloneable
{
	void display()
	{
		System.out.println("cloning of an object creation");
	}
	Object myClone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class ObjectClonableImpl 
{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		emp1 e1=new emp1();
		e1.display();
		//clonable object for emp class 
		emp1 e2=(emp1)e1.myClone();
		e2.display();
	}

}
