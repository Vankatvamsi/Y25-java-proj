package com.skills;
import java.util.*;
import java.util.stream.*;
class StudentMark {
    String name;
    int marks;
    StudentMark(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return name + "(" + marks + ")";
    }
}
public class AverageTop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<StudentMark> list = new ArrayList<>();
        System.out.println("ID no: 2500031933");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            list.add(new StudentMark(name, marks));
        }
        double avg = list.stream().mapToInt(s -> s.marks).average().orElse(0);
        System.out.println("Average Marks: " + avg);
        List<StudentMark> top = list.stream()
                .filter(s -> s.marks > avg)
                .collect(Collectors.toList());
        System.out.println("Top Performers: " + top);
    }
}
