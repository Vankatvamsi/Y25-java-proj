package com.homeassignments;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        double PI = 3.14;
        System.out.println("ID no: 2500031933");
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
        sc.close();
    }
}
