package com.vamsi;
import java.io.DataInputStream;
import java.io.IOException;
public class COmpileTimeExceptionImplementation {

	public static void main(String[] args)throws IOException
	{
		
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("enter your name");
		String s2=dis.readLine();
		System.out.println("entered name is :"+s2);
		

	}

}
