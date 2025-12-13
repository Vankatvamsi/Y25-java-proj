package com.skills;

class Fraction {
private int num, den;
public Fraction(int num, int den) {
this.num = num;
this.den = den;
simplify();
}
private int gcd(int a, int b) {
return (b == 0) ? a : gcd(b, a % b);
}
private void simplify() {
int g = gcd(Math.abs(num), Math.abs(den));
num /= g;
den /= g;
}
public Fraction add(Fraction f) {
int newNum = this.num * f.den + f.num * this.den;
int newDen = this.den * f.den;
return new Fraction(newNum, newDen); // auto-simplified
}
public void display() {
System.out.println(num + "/" + den);
}
}

public class S7Fraction {
public static void main(String[] args) {
Fraction f1 = new Fraction(2, 4);
Fraction f2 = new Fraction(3, 9);
System.out.print("F1 Simplified: ");
f1.display();
System.out.print("F2 Simplified: ");
f2.display();
Fraction sum = f1.add(f2);
System.out.print("Sum = ");
sum.display();
}
}

