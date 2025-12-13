package com.vamsi;

class Garbage
{
	void display()
	{
		System.out.println("implementation of garabage collector");
	}
	@Override
	protected void finalize() throws Throwable 
	{
		super.finalize();
		System.out.println("removed unreferenced object ");
	}
}

public class GarbageCollectorImpl 
{

	public static void main(String[] args) 
	{
		Garbage g1=new Garbage();
		g1.display();
		Garbage g2=new Garbage();
		g2.display();
		//make g2 object as unreferenced object
		g2=null;
		//call garbage collector
		System.gc();
		g2.display();
		
		
	}

}
