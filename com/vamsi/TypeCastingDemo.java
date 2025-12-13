package com.vamsi;

public class TypeCastingDemo {

	public static void main(String[] args) {
		int a=10;
		double b=45.56;
		//double to int
		//by the user
		//typecast is required it is also known as explicit type conversion
		a=(int)b;
		//int-double
		//java complier-implict type casting
		b=a;
		System.out.println(a);
		System.out.println(b);
			
	}

}
