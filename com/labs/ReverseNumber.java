package labs;
//Lab Program: Reverse a Three-Digit Number (Using while loop)

import java.util.Scanner;

public class ReverseNumber {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Taking a three-digit number as input
     System.out.print("Enter a three-digit number: ");
     int num = sc.nextInt();

     int rev = 0;     // to store reversed number

     // while loop for reversing
     while (num != 0) {
         int digit = num % 10;      // get last digit
         rev = (rev * 10) + digit;  // build the reversed number
         num = num / 10;            // remove last digit
     }

     // Output
     System.out.println("Reversed number = " + rev);

     sc.close();
 }
}

