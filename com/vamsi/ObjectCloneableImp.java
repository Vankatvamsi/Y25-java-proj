package com.vamsi;
class Emp1 implements Cloneable{
	void display() {
		System.out.println("cloning of object creation!");
	}
	Object myClone() throws CloneNotSupportedException {
		return super.clone();	}
}
public class ObjectCloneableImp {

	public static void main(String[] args) throws CloneNotSupportedException {
		Emp1 e1=new Emp1();
		e1.display();
		//cloneable obj for Emp1 class
		Emp1 e2=(Emp1)e1.myClone();
		e2.display();
	}

}
