package com.skills;
import java.util.Scanner;
public class FloodFill {
    static int a[][], n, m, oldValue, newValue;

    static void fill(int r, int c){
        if(r<0||c<0||r>=n||c>=m) return;
        if(a[r][c]!=oldValue) return;
        a[r][c]=newValue;
        fill(r+1,c);
        fill(r-1,c);
        fill(r,c+1);
        fill(r,c-1);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.print("Enter rows and columns: ");
        n=sc.nextInt(); m=sc.nextInt();
        a=new int[n][m];
        System.out.println("Enter matrix:");
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j]=sc.nextInt();
        System.out.print("Enter start cell (row col): ");
        int r=sc.nextInt(), c=sc.nextInt();
        oldValue=a[r][c];
        System.out.print("Enter new value: ");
        newValue=sc.nextInt();
        fill(r,c);
        System.out.println("Matrix after fill:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) System.out.print(a[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
