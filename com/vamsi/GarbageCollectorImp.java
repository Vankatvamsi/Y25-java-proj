package com.vamsi;
class Garbage{
	void display() {
		System.out.println("imp of Garbage Collector");
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("removed unreferenced object g2");
	}
}
public class GarbageCollectorImp {

	public static void main(String[] args) 
	{
		Garbage g1=new Garbage();
		g1.display();
		Garbage g2=new Garbage();
		g2.display();
		//make g2 object as unreferenced
		g2=null;
		//call garbage collector
		System.gc();
	

	}

}
