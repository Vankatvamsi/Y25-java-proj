package com.vamsi;

import java.io.DataInputStream;

public class SwitchDemo 
{

	public static void main(String[] args)
	throws Exception
	{
	   int a;
	   DataInputStream dis = new DataInputStream(System.in);
	   System.out.println("Enter a value");
	   a=Integer.parseInt(dis.readLine());
	   switch (a) 
	   {
	   case 1:{System.out.println("Monday");
	   System.out.println("My favourite day");
	   break;}
	   case 2:{System.out.println("Tuesday");
	   System.out.println("My favourite day");
	   break;}
	   case 3:{System.out.println("Wednesday");
	   System.out.println("My favourite day");
	   break;}
	   case 4:{System.out.println("Thurday");
	   System.out.println("My favourite day");
	   break;}
	   case 5:{System.out.println("Friday");
	   System.out.println("My favourite day");
	   break;}
	   case 6:{System.out.println("Saturday");
	   System.out.println("My favourite day");
	   break;}
	   case 7:{System.out.println("Sunday");
	   System.out.println("My favourite day");
	   break;}
	   default:{System.out.println("Invalid");
	   System.out.println("My Dummy day");
	   break;}
	   }
	   System.out.println("it is switch program");
	}
	   
	}

