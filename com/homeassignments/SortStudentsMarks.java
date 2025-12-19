package com.homeassignments;
import java.util.*;
public class SortStudentsMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> marks = new HashMap<>();
        System.out.println("ID no: 2500031933");
        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks for " + name + ": ");
            int mark = sc.nextInt();
            sc.nextLine(); 
            marks.put(name, mark);
        }
        System.out.println("Original Marks: " + marks);
        Map<String, Integer> sortedMarks = new TreeMap<>(marks);
        System.out.println("Sorted Marks by Student Name: " + sortedMarks);
        sc.close();
    }
}
