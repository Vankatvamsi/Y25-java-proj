package com.vamsi;

public class ExceptionHandlingImpl {

	public static void main(String[] args) {
		int a=10,b;
		System.out.println("open file");
		System.out.println("a:"+a);
		try
		{
		//exception occurred at the 10th line:ArithmeticException
		b=a/2;
		System.out.println("b:"+b);
		}
		
		catch (ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("divide no. by zero Invalid");
		}
		try { 
			// Exception occurred ArrayIndexOutOfBoundsException
				int s[]= new int[] {10,20,30};
				s[5]=100;
				System.out.println(s[5]);
		}
		
		catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie);
			System.out.println("accessing element using out of index is invalid");
		}
		finally {
			System.out.println("close file");
		
		}
		

	}

}
