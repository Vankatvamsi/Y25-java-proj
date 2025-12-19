package com.vamsi;

import java.io.DataInputStream;

public class SwitchDemo {

	public static void main(String[] args) throws Exception
	{
		int a;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter a value");
		a=Integer.parseInt(dis.readLine());//readline is used to read entered data as a string.
		switch (a)
		{
		case 1: System.out.println("Day is Monday");
		break;
		case 2: System.out.println("Day is Tuesday");
		break;
		case 3: System.out.println("Day is Wednesday");
		break;
		case 4: System.out.println("Day is Thuday");
		break;
		case 5: System.out.println("Day is Friday");
		break;
		case 6: System.out.println("Day is Saturday");
		break;
		case 7: System.out.println("Day is sunday");
		break;
			
		
		
		default: System.out.println("Day is invalid");
		break;
			
		}
		System.out.println("it is out of switch block");

	}

}
