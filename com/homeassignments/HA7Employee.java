package com.homeassignments;

class Employee 
{
    int empId;
    String name;
    double salary;
    Employee(int empId, String name, double salary) 
    {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    double calculateNetSalary() 
    {
        double tax = 0.1 * salary;
        return salary - tax;
    }
}
public class HA7Employee 
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee(112, "Vamsi", 90000);
        System.out.println("Net Salary: " + emp.calculateNetSalary());
    }
}
