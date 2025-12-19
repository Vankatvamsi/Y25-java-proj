package com.vamsi;
abstract class Area{
	
	String name;
	Area(String name){
	this.name=name;
	}
	//method implemented-->concrete method
	void display() {
		System.out.println("I am implementing Abstract Classes");
		System.out.println("i am:"+this.name);
	}
	// only method header or abstract method-method is not implemented
	abstract void area(); 
}
//creation of subclass
class Rectangle  extends Area{
	Rectangle(String name){
		super(name);
	}

	@Override
	void area() {
		int l=10;
		int b=20;
		System.out.println("Area of Rectangle:"+(l*b));
		
	}	
	void display2() {
		System.out.println("it is a subclass member!");
	}
}
class Triangle extends Area{
	Triangle(String name){
		super(name);
	}

	@Override
	void area() {
		int h=10;
		int b=20;
		System.out.println("Area of Triangle:"+(0.5)*b*h);
		
	}
	
}
public class AbstractClassImplementation {

	public static void main(String[] args) {
		//create reference variable
		Area obj;//obj is reference of abstract class Area..
		Rectangle obj1=new Rectangle("balu");
		obj=obj1;//we hava assigned the address of obj1 to obj 
		obj.display();
		obj.area();
		obj1.display2();
		Triangle obj2=new Triangle("ramu");
		obj=obj2;
		obj.display();
		obj.area();

	}

}
