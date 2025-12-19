package labs;
//Lab 10: Reverse a Number and Check Palindrome (Using Nested Loop)

import java.util.Scanner;

public class ReversePalindrome {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input
     System.out.print("Enter any number: ");
     int num = sc.nextInt();

     int original = num;   // store original number
     int rev = 0;

     // Outer loop runs once (just to use nested loop)
     for (int i = 1; i <= 1; i++) {

         // Inner loop reverses the number
         while (num != 0) {
             int digit = num % 10;       // get last digit
             rev = (rev * 10) + digit;   // build reverse
             num = num / 10;             // remove last digit
         }
     }

     // Output reversed number
     System.out.println("Reversed Number = " + rev);

     // Check palindrome
     if (rev == original) {
         System.out.println(original + " is a Palindrome.");
     } else {
         System.out.println(original + " is NOT a Palindrome.");
     }

     sc.close();
 }
}


