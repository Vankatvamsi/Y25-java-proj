package com.homeassignments;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class EmailValidation {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("ID no: 2500032048");
 System.out.print("Enter an email address: ");
 String email = sc.nextLine();
 String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
 Pattern pattern = Pattern.compile(regex);
 Matcher matcher = pattern.matcher(email);
 if (matcher.matches())
 System.out.println("Valid email address.");
 else
 System.out.println("Invalid email address.");
 sc.close();
 }
}
