package com.skills;
import java.io.*;
public class SalaryreportWriter {
    public static void main(String[] args) {
        String file = "salary_report.txt";
        String[][] employees = {
            {"Aryan", "25000"},
            {"Raman", "45000"},
            {"Shivam", "70000"}
        };
        System.out.println("ID no: 2500031933");
        try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
            pw.println("Employee Salary Report");
            pw.println("-----------------------");
            for (String[] emp : employees) {
                String name = emp[0];
                double salary = Double.parseDouble(emp[1]);
                double tax;
                if (salary <= 30000) tax = salary * 0.05;
                else if (salary <= 60000) tax = salary * 0.10;
                else tax = salary * 0.15;
                pw.println(name + " | Salary: " + salary + " | Tax: " + tax);
            }
            System.out.println("Report written to salary_report.txt");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}