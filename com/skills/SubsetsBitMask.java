package com.skills;
import java.util.Scanner;
public class SubsetsBitMask{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ID no: 2500031933");
System.out.print("Enter size: ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.print("Enter elements: ");
for(int i=0;i<n;i++) a[i]=sc.nextInt();
int total=1<<n;
System.out.println("Subsets:");
for(int mask=0;mask<total;mask++){
System.out.print("{ ");
for(int i=0;i<n;i++){
if((mask&(1<<i))!=0) System.out.print(a[i]+" ");
}
System.out.println("}");
}
sc.close();
}
}
