package com.homeassignments;
import java.util.*;
public class Top3Scorers {
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
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        pq.addAll(marks.entrySet());
        System.out.println("Top 3 Scorers:");
        for (int i = 0; i < 3 && !pq.isEmpty(); i++) {
            Map.Entry<String, Integer> entry = pq.poll();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }      
        sc.close();
    }
}
