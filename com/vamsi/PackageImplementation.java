package com.vamsi;

public class PackageImplementation {

	public static void main(String[] args) {
		com.arithmaticoperations.Addition obj1=new com.arithmaticoperations.Addition();//or you can import com.arithmeticoperations.*;
		int result1=obj1.sum(10,20);
		System.out.println("result of addition="+result1);
		com.arithmaticoperations.Subtraction obj2=new com.arithmaticoperations.Subtraction();
		int result2=obj2.sub(20,10);
		System.out.println("result of subtraction="+result2);
	}

}

