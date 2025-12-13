package com.vamsi;

import java.util.Scanner;

public class PatternsDemo {

	public static void main(String[] args) {
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		n=sc.nextInt();
		for(i=n;i>0;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}

}
