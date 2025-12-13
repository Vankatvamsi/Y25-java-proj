package com.vamsi;

import java.util.Scanner;

public class ControlStmt 
{
	
	public static void main(String args[])
	{
		int a,b;
		String name;
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name:");
			name=sc.nextLine();
			System.out.println("Enter a value:");
			a=sc.nextInt();
			System.out.println("Enter b value:");
			b=sc.nextInt();
		
		System.out.println("Entered Name is:"+name);
		System.out.println("a value="+a);
		System.out.println("b value="+b);
		//if-else
		if(a<b)
		{
			System.out.println(a+"is smaller than"+b);
		}
		else
		{
			System.out.println(b+"is smaller than"+a);
		}
		//nested if-else
		if(a>0)
		{
			System.out.println(a+" is positive");
		}
		else if(a<0)
		{
			System.out.println(a+" is negative");
		}
		else
		{
			System.out.println(a+" is zero");
		}
		//else-if ladder
		if(a==1)
		{
			System.out.println("Monday");
		}
		else if(a==2)
		{
			System.out.println("Tuesday");
		}
		else if(a==3)
		{
			System.out.println("Wednesday");
		}
		else if(a==4)
		{
			System.out.println("Thursday");
		}
		else if(a==5)
		{
			System.out.println("Friday");
		}
		else if(a==6)
		{
			System.out.println("Saturday");
		}
		else if(a==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("invalid day");
		}
		
	}

}
