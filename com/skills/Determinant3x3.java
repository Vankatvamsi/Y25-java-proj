package com.skills;
import java.util.Scanner;
public class Determinant3x3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        int a[][]=new int[3][3];
        System.out.println("Enter 3x3 matrix:");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                a[i][j]=sc.nextInt();
        int det=a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1])
               -a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0])
               +a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
        System.out.println("Determinant = "+det);
        sc.close();
    }
}
