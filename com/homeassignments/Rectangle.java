package com.homeassignments;
import java.util.Scanner;
class Rectangle {
    double length;
    double width;
    double calculateArea() {
        return length * width;
    }
    double calculatePerimeter() {
        return 2 * (length + width);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        Rectangle rect = new Rectangle();
        rect.length = length;
        rect.width = width;
        System.out.println("Area = " + rect.calculateArea());
        System.out.println("Perimeter = " + rect.calculatePerimeter());
        sc.close();
    }
}
