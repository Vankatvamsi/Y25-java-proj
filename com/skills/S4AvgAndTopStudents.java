package com.skills;

import java.util.*;
public class S4AvgAndTopStudents 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int total = 0;
        System.out.println("Enter marks of each student:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double average = (double) total / n;
        System.out.println("Average Marks = " + average);
        Arrays.sort(marks); 
        System.out.println("Top 3 Marks:");
        for (int i = n - 1; i >= Math.max(0, n - 3); i--) {
            System.out.println(marks[i]);
        }
    }
}