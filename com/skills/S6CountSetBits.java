package com.skills;
import java.util.Scanner;
public class S6CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);   // add last bit
            n >>= 1;            // shift right
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("Number of set bits = " + countSetBits(n));
        sc.close();
    }
}
