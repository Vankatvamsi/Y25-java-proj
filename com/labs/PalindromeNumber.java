package labs;
//Lab Program: Check Palindrome Number
//A number is palindrome if the reversed number is same as the original.

import java.util.Scanner;

public class PalindromeNumber {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input from user
     System.out.print("Enter any number: ");
     int num = sc.nextInt();

     int original = num;   // store original number
     int rev = 0;          // to store reversed number

     // Reverse the number using while loop
     while (num != 0) {
         int digit = num % 10;      // extract last digit
         rev = (rev * 10) + digit;  // build reversed number
         num = num / 10;            // remove last digit
     }

     // Check if palindrome
     if (rev == original) {
         System.out.println(original + " is a Palindrome Number.");
     } else {
         System.out.println(original + " is NOT a Palindrome Number.");
     }

     sc.close();
 }
}

