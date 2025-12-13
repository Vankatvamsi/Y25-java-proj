package com.homeassignments;
import java.util.Scanner;
public class HA1Average 
{
	public static void main(String[] args) 
	{
		int a,b,c,d,e,avg;
		Scanner s1 =new Scanner(System.in);
		System.out.print("Give 1st Number: ");
		a=s1.nextInt();
		System.out.print("Give 2nd Number: ");
		b=s1.nextInt();
		System.out.print("Give 3rd Number: ");
		c=s1.nextInt();
		System.out.print("Give 4th Number: ");
		d=s1.nextInt();
		System.out.print("Give 5th Number: ");
		e=s1.nextInt();
		avg=a+b+c+d+e/5;
		System.out.print("Average to the given five numbers is: "+avg);
	}
}
