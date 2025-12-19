package com.skills;
import java.util.Scanner;
public class AverageTopThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int m[]=new int[n];
        int sum=0;
        System.out.print("Enter marks: ");
        for(int i=0;i<n;i++){m[i]=sc.nextInt();sum+=m[i];}
        double avg=(double)sum/n;
        java.util.Arrays.sort(m);
        System.out.println("Average = "+avg);
        System.out.println("Top 3 marks:");
        for(int i=n-1;i>=n-3;i--) System.out.println(m[i]);
        sc.close();
    }
}
