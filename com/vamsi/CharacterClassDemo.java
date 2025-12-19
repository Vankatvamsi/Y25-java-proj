package com.vamsi;

import java.util.Scanner;

public class CharacterClassDemo {

	public static void main(String[] args)
	{
		System.out.println("enter any character:");
		Scanner s1=new Scanner(System.in);
		char ch=s1.next().charAt(0);
		int a=97;
		System.out.println("entered character is:"+ch);
		System.out.println("entered character is:"+Character.isLetter(ch));
		System.out.println("entered character is:"+Character.isDigit(ch));
		System.out.println("entered character is:"+Character.isWhitespace(ch));
		System.out.println("entered character is:"+Character.isLetterOrDigit(ch));
		System.out.println("entered character is:"+Character.isLowerCase(ch));
		System.out.println("entered character is:"+Character.isUpperCase(ch));
		System.out.println("entered character is:"+Character.toLowerCase(ch));
		System.out.println("entered character is:"+Character.toUpperCase(a));
		System.out.println("entered character is:"+Character.toLowerCase(a));
		System.out.println("entered character is:"+Character.toUpperCase(97));
		
		
		

	}

}
