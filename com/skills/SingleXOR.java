package com.skills;
import java.util.Scanner;
public class SingleXOR{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ID no: 2500031933");
System.out.print("Enter size: ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.print("Enter elements: ");
for(int i=0;i<n;i++) a[i]=sc.nextInt();
int x=0;
for(int i=0;i<n;i++) x^=a[i];
System.out.println("Single non-repeating element = "+x);
sc.close();
}
}
