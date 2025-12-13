package com.homeassignments;
import java.util.Scanner;
public class HA02GradeCalc 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		 int sub1, sub2, sub3, sub4, sub5;
	        float total, percentage;
	        System.out.println("Enter marks out of 100 ");
	        System.out.print("Enter marks for Subject 1: ");
	        sub1 = s1.nextInt();
	        System.out.print("Enter marks for Subject 2: ");
	        sub2 = s1.nextInt();
	        System.out.print("Enter marks for Subject 3: ");
	        sub3 = s1.nextInt();
	        System.out.print("Enter marks for Subject 4: ");
	        sub4 = s1.nextInt();
	        System.out.print("Enter marks for Subject 5: ");
	        sub5 = s1.nextInt();
	        total = sub1 + sub2 + sub3 + sub4 + sub5;
	        percentage = total / 5;
	        System.out.println("\nTotal Marks = " + total);
	        System.out.println("Percentage = " + percentage + "%");
	        if (percentage >= 90){
	            System.out.println("Grade: A+");
	        } else if (percentage >= 80) {
	            System.out.println("Grade: A");
	        } else if (percentage >= 70) {
	            System.out.println("Grade: B");
	        } else if (percentage >= 60) {
	            System.out.println("Grade: C");
	        } else if (percentage >= 50) {
	            System.out.println("Grade: D");
	        } else {
	            System.out.println("Grade: F (Fail)");
	        }
	}
}
