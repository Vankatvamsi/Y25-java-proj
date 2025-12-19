package com.vamsi;
class Calculate{
	void calculate(int x) {
		System.out.println("sq. of x:"+(x*x));
	}
}
class Calculate2 extends Calculate{
	void calculate(int x) {
		System.out.println("Square root:"+Math.sqrt(x));
	}
}
public class DynamicPolymorphismImplement {
	public static void main(String[] args) {
		Calculate2 c1=new Calculate2();
		 c1.calculate(25);

	}

}
