package com.skills;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n/2;i++){
            int t=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=t;
        }
        System.out.println("Reversed array:");
        for(int x:a) System.out.print(x+" ");
        sc.close();
    }
}
