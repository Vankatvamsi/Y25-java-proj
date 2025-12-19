package labs;

//Lab Program: Display First N Natural Numbers and Their Sum

import java.util.Scanner;

public class NaturalNumbers {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input from user
     System.out.print("Enter the value of N: ");
     int n = sc.nextInt();

     int sum = 0;

     System.out.println("\nFirst " + n + " Natural Numbers:");
     
     // Loop to print natural numbers and calculate sum
     for (int i = 1; i <= n; i++) {
         System.out.print(i + " ");
         sum = sum + i;
     }

     // Output sum
     System.out.println("\n\nSum of first " + n + " natural numbers = " + sum);

     sc.close();
 }
}

