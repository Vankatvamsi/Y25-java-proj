package com.homeassignments;
import java.util.Scanner;
public class RemoveDuplicates {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("ID no: 2500032048");
 System.out.print("Enter a string: ");
 String input = sc.nextLine();
 StringBuilder result = new StringBuilder();
 boolean[] seen = new boolean[256];
 for (char c : input.toCharArray()) {
 if (!seen[c]) {
 seen[c] = true;
 result.append(c);
 }
 }
 System.out.println("String after removing duplicates: " +
		 result.toString());
		  sc.close();
 }
}
