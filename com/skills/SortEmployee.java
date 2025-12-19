package com.skills;
import java.util.*;
class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return name + " - $" + salary;
    }
}
public class SortEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        System.out.println("ID no: 2500031933");
        System.out.print("How many employees? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            list.add(new Employee(name, salary));
        }
        list.sort((a, b) -> Double.compare(a.salary, b.salary));
        System.out.println("Sorted by Salary:");
        System.out.println(list);
    }
}
