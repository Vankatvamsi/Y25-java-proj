package com.skills;
import java.util.Scanner;
public class MagicSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.print("Enter size n: ");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter matrix:");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        int sum=0;
        for(int j=0;j<n;j++) sum+=a[0][j];
        boolean magic=true;
        for(int i=1;i<n;i++){
            int s=0;
            for(int j=0;j<n;j++) s+=a[i][j];
            if(s!=sum) magic=false;
        }
        for(int j=0;j<n;j++){
            int s=0;
            for(int i=0;i<n;i++) s+=a[i][j];
            if(s!=sum) magic=false;
        }
        int d1=0,d2=0;
        for(int i=0;i<n;i++){d1+=a[i][i];d2+=a[i][n-1-i];}
        if(d1!=sum||d2!=sum) magic=false;
        System.out.println(magic?"Magic Square":"Not a Magic Square");
        sc.close();
    }
}
