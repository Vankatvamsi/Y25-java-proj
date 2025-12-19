package com.skills;
import java.util.*;
class Student {
    String name;
    String grade;
    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
    public String toString() {
        return name;
    }
}
public class GroupStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Student>> map = new HashMap<>();
        System.out.println("ID no: 2500031933");
        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter grade: ");
            String grade = sc.nextLine();
            map.computeIfAbsent(grade, k -> new ArrayList<>())
                .add(new Student(name, grade));
        }
        System.out.println("Grouped Students: " + map);
        sc.close();
    }
}
