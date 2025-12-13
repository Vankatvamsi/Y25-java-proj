package com.vamsi;

import java.util.Scanner;

public class CharacterClassDemo {

	public static void main(String[] args) 
	{
		System.out.println("Enter any character");
		Scanner sc=new Scanner(System.in);
		char c1=sc.next().charAt(0);
		int a=97;
		System.out.println("Entered character is:"+Character.isLetter(c1));
		System.out.println("Entered character is:"+Character.isLetterOrDigit(c1));
		System.out.println("Entered character is:"+Character.isDigit(c1));
		System.out.println("Entered character is:"+Character.isWhitespace(c1));
		System.out.println("Entered character is:"+Character.isLowerCase(c1));
		System.out.println("Entered character is:"+Character.isUpperCase(c1));
		System.out.println("Entered character is:"+Character.toUpperCase(c1));
		System.out.println("Entered character is:"+Character.toLowerCase(c1));
		System.out.println("Entered character is:"+Character.toUpperCase(97));
		System.out.println("Entered character is:"+Character.isSpaceChar(c1));
	}

}
