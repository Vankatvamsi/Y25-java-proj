package com.skills;
import java.util.Scanner;
public class PairSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.print("Enter K: ");
        int k=sc.nextInt();
        System.out.println("Pairs with sum "+k+":");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==k) System.out.println(a[i]+", "+a[j]);
            }
        }
        sc.close();
    }
}
