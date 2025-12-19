package com.vamsi;

import java.util.Scanner;

public class ControlstatementDemo {

	public static void main(String[] args)
	{
		int a,b;
		String name;
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter your name:");
		name=S1.nextLine();
		System.out.println("Enter a value:");
		a=S1.nextInt();
		System.out.println("Enter b value:");
		b=S1.nextInt();
		
		System.out.println("a value is:"+a);
		System.out.println("a value is:"+b);
		System.out.println("Your name:"+name);
		 //if else
		if(a<b)
			System.out.println(a+" is smaller than "+b);
		else
		System.out.println(b+" is smaller than "+a);
		if(a>0)//nested if else
			System.out.println(a+" is positive");
		else if (a<0)
			System.out.println(a+" is negative");
		else
			System.out.println(a+" is zero");
		if(a==1)
			System.out.println("Day is Monday");
		else if(a==2)
			System.out.println("Day is Tuesday");
		else if(a==3)
			System.out.println("Day is Wednesday");
		else if(a==4)
			System.out.println("Day is Thursday");
		else if(a==5)
			System.out.println("Day is Friday");
		else if(a==6)
			System.out.println("Day is Saturday");
		else if(a==7)
			System.out.println("Day is Sunday");
		else
			System.out.println("Invalid day");
		
			
		
		

	}

}
