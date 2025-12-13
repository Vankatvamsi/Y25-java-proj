package com.homeassignments;
import java.util.Scanner;
public class HA02RootQuad 
{
	public static void main(String[] args) 
	{
			 double a, b, c, D, r1, r2, real, imag;
		        Scanner s1 = new Scanner(System.in);
		        System.out.println("Enter coefficients a, b, and c: ");
		        a = s1.nextDouble();
		        b = s1.nextDouble();
		        c = s1.nextDouble();
		        D = b * b - 4 * a * c;
		        if (D > 0) 
		        {
		            r1 = (-b + Math.sqrt(D)) / (2 * a);
		            r2 = (-b - Math.sqrt(D)) / (2 * a);
		            System.out.println("Roots are real and distinct");
		            System.out.println("Root 1 = " + r1 + ", Root 2 = " + r2);
		        } 
		        else if (D == 0) 
		        {
		            r1 = -b / (2 * a);
		            System.out.println("Roots are real and equal.");
		            System.out.println("Root 1 = Root 2 = " + r1);
		        } 
		        else 
		        {
		            real = -b / (2 * a);
		            imag = Math.sqrt(-D) / (2 * a);
		            System.out.println("Roots are imaginary.");
		            System.out.println("Root 1 = " + real + " + " + imag + "i");
		            System.out.println("Root 2 = " + real + " - " + imag + "i");
		        }
	}
}
