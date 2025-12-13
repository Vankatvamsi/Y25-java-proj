package com.skills;
class QuadraticEquation {
private double a, b, c;
public QuadraticEquation(double a, double b, double c) {
this.a = a;
this.b = b;
this.c = c;
}
public double getDiscriminant() {
return (b * b) - (4 * a * c);
}
public void findRoots() {
double d = getDiscriminant();
if (d > 0) {
double r1 = (-b + Math.sqrt(d)) / (2 * a);
double r2 = (-b - Math.sqrt(d)) / (2 * a);
System.out.println("Real and Distinct Roots: " + r1 + " , " + r2);
}
else if (d == 0) {
double r = -b / (2 * a);
System.out.println("Real and Equal Root: " + r);
}
else {
double real = -b / (2 * a);
double imag = Math.sqrt(-d) / (2 * a);
System.out.println("Complex Roots: " + real + " + " + imag + "i , " + real + " - " + imag + "i");
}
       }
}
public class S7Quadratic {
public static void main(String[] args) {
QuadraticEquation q = new QuadraticEquation(1, -3, 2);
System.out.println("Discriminant: " + q.getDiscriminant());
q.findRoots();
}
}
