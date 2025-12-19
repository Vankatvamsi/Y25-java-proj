package com.skills;
import java.util.Scanner;
public class GCDLCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        int x=a,y=b;
        while(y!=0){
            int t=y;
            y=x%y;
            x=t;
        }
        int gcd=x;
        int lcm=(a*b)/gcd;
        System.out.println("GCD = "+gcd);
        System.out.println("LCM = "+lcm);
        sc.close();
    }
}
