package labs;

//Lab Program: Print All Factors of a Number

import java.util.Scanner;

public class Factors {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input from user
     System.out.print("Enter any number: ");
     int num = sc.nextInt();

     System.out.println("\nFactors of " + num + " are:");

     // Loop to find factors
     for (int i = 1; i <= num; i++) {
         if (num % i == 0) {
             System.out.print(i + " ");
         }
     }

     sc.close();
 }
}

