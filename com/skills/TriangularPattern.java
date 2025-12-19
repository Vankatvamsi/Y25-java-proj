package com.skills;
import java.util.Scanner;
public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.print("Enter number of rows: ");
        int r=sc.nextInt();
        System.out.println("Number Pattern:");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++) System.out.print(j+" ");
            System.out.println();
        }
        System.out.println("Star Pattern:");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}
