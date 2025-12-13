package com.vamsi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNameUsingStreamClass 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name:");
		String name = br.readLine();
		System.out.println("Entered name is "+name);
		
	}

}
