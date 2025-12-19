package com.homeassignments;
import java.util.Scanner;
class InvalidMarksException extends Exception {
    private static final long serialVersionUID = 1L;
    InvalidMarksException(String message) { super(message); }
}
public class ResultValidator {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        try {
            if (marks < 0 || marks > 100)
            	throw new InvalidMarksException("Marks must be 0-100");
            System.out.println(name + " scored " + marks + " and " + (marks >= 50 ? "Pass" : "Fail"));
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close(); 
    }
}
