package com.vamsi;
public class CommandLineArguements 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<args.length;i++)
			{
			System.out.println("First Argument is:"+args[i]);
			}
		//addition of arguments
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int result=n1+n2;
		System.out.println("Sum of arguments:"+result);
	}
}