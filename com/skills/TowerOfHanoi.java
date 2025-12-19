package com.skills;
import java.util.Scanner;
public class TowerOfHanoi{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ID no: 2500031933");
System.out.print("Enter disks: ");
int n=sc.nextInt();
long moves=(1L<<n)-1;
System.out.println("Total moves = "+moves);
sc.close();
}
}
