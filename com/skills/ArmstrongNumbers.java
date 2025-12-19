package com.skills;
public class ArmstrongNumbers {
    public static void main(String[] args) {
    	System.out.println("ID no: 2500031933");
        System.out.println("Armstrong numbers between 1 and 1000:");
        for(int num=1;num<=1000;num++){
            int temp=num,sum=0,digits=0;
            int n=temp;
            while(n>0){digits++;n/=10;}
            n=temp;
            while(n>0){
                int d=n%10;
                sum+=Math.pow(d,digits);
                n/=10;
            }
            if(sum==num) System.out.println(num);
        }
    }
}
