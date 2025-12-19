package com.skills;
import java.util.Scanner;
public class LargestRowColSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.print("Enter matrix size n: ");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        int maxRowSum=-9999,rowIndex=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++) sum+=a[i][j];
            if(sum>maxRowSum){maxRowSum=sum;rowIndex=i;}
        }
        int maxColSum=-9999,colIndex=0;
        for(int j=0;j<n;j++){
            int sum=0;
            for(int i=0;i<n;i++) sum+=a[i][j];
            if(sum>maxColSum){maxColSum=sum;colIndex=j;}
        }
        System.out.println("Largest Row Sum = "+maxRowSum+" at row "+rowIndex);
        System.out.println("Largest Column Sum = "+maxColSum+" at column "+colIndex);
        sc.close();
    }
}
