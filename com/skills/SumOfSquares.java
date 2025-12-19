package com.skills;
import java.util.Scanner;
public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.print("Enter N: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++) sum+=i*i;
        System.out.println("Sum of series = "+sum);
        sc.close();
    }
}
