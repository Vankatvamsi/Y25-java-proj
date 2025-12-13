package com.vamsi;
import java.io.DataInputStream;
import java.io.IOException;

public class CompileTimeExceptionImpl 
{
	public static void main(String[] args)throws IOException
	{
		DataInputStream dis=new DataInputStream(System.in);
		System.out.print("Enter your Name: ");
		String s2=dis.readLine();
		System.out.println("Entered Name is "+s2);
	}

}   
