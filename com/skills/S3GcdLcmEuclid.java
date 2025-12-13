package com.skills;
import java.util.Scanner;
public class S3GcdLcmEuclid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int x = a, y = b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        int lcm = (x * y) / gcd;
        System.out.println("GCD (Euclidean) = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
