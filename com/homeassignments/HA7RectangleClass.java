package com.homeassignments;

class Rectangle {
    double length, width;
    Rectangle(double len, double wid) {
        length = len;
        width = wid;
    }
    double area() {
        return length * width;
    }
    double perimeter() {
        return 2 * (length + width);
    }
}
public class HA7RectangleClass 
{
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
