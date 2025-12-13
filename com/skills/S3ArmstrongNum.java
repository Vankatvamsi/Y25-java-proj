package com.skills;

public class S3ArmstrongNum {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 to 1000:");
        for (int num = 1; num <= 1000; num++) {
            int temp = num, sum = 0, digits = 0;
            while (temp != 0) {
                digits++;
                temp /= 10;
            }
            temp = num;
            while (temp != 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, digits);
                temp /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
