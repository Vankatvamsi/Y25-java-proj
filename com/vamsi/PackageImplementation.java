package com.vamsi;
import com.arithmaticoperations.*;
public class PackageImplementation 
{
	public static void main(String[] args) 
	{
		Addition obj=new Addition();
		int res1=obj.sum(10,20);
		System.out.println("Result of Addition="+res1);
		Substraction obj1=new Substraction();
		int res2=obj1.sub(50,15);
		System.out.println("Result of Substriaction="+res2);
	}

}
