package com.skills;
import java.util.Scanner;
public class Quadratic {
double a,b,c;
Quadratic(double a,double b,double c){this.a=a;this.b=b;this.c=c;}
double discriminant(){return b*b-4*a*c;}
void roots(){
double d=discriminant();
if(d>0){double r1=(-b+Math.sqrt(d))/(2*a);double r2=(-b-Math.sqrt(d))/(2*a);
System.out.println("ID no: 2500031933");
System.out.println("Roots are real and distinct: "+r1+" , "+r2);
}
else if(d==0){double r=-b/(2*a);System.out.println("Roots are real and equal: "+r);
}
else System.out.println("Roots are complex");
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ID no: 2500031933");
System.out.print("Enter coefficients a b c: ");
double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
Quadratic q=new Quadratic(a,b,c);
System.out.println("Discriminant = "+q.discriminant());
q.roots();
sc.close();
}
}
