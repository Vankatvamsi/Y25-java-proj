package com.vamsi;

public class WrapperClassDemo 
{
	public static void main(String[] args)
	{
		int i=10;
		Integer x=i;
		Integer i1=new Integer(100);
		System.out.println(i);
		System.out.println(x);
		System.out.println(i1.intValue());//object--value
		System.out.println(Integer.valueOf(i));//value--object
		Integer i2=new Integer(100);
		if(i1==i2)
		{
			System.out.println("two objects are equal:");
		}
		else
		{
			System.out.println("two objects are not equal");
		}
	}

}
