package com.skills;
import java.util.Scanner;
public class PowerOfTwo{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ID no: 2500031933");
System.out.print("Enter number: ");
int n=sc.nextInt();
boolean isPower=(n>0&&(n&(n-1))==0);
System.out.println(isPower?"Power of 2":"Not a power of 2");
sc.close();
}
}
