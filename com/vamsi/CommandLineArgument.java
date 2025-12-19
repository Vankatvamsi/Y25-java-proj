package com.vamsi;
public class CommandLineArgument {
	
	public static void main(String[] args)
	{
		for(int i=0;i<args.length;i++)
		{
			
		
		System.out.println("argument is :"+args[i]);
		}
		/*System.out.println("second argument is:"+args[1]);
		System.out.println("third argumint is "+args[2]);*/
		int n1=Integer.parseInt(args[0]);
		
		int n2=Integer.parseInt(args[1]);
		System.out.println("first argument:"+n1);
		System.out.println("second argument:"+n2);
		int result=n1+n2;
		System.out.println("result:"+result);
		
		
	}
	

}
