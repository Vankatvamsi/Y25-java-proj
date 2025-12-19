package com.homeassignments;
import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId;
        String name;
        double salary;
        System.out.println("ID no: 2500031933");
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        double deduction = salary * 10 / 100;
        double netSalary = salary - deduction;
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Gross Salary: " + salary);
        System.out.println("Net Salary: " + netSalary);
        sc.close();
    }
}
