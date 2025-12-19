package com.vamsi;
public class UserDefinedExceptionImplementation extends Exception {

	private static final long serialVersionUID = 1L;
	UserDefinedExceptionImplementation(){
		
	}
	UserDefinedExceptionImplementation(String ex){
		super(ex);
	}

	public static void main(String[] args) {
	String name[]= {"anu","balu","sita","ramu","ramya"};
	int accNo[]= {1245,4567,2568,5689,8975};
	int balance[]= {100000,200000,78000,5000,89000};
	try
	{
		for (int i=0;i<5;i++) {
			System.out.println(name[i]+" "+accNo[i]+" "+balance[i]);
			if(balance[i]<=10000) {
				UserDefinedExceptionImplementation obj=new UserDefinedExceptionImplementation("balace amt is less then the minimum account balance so your account will be suspend soon!");
						throw obj;
			}
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("user defined exception successfully");
	}
		

	}

}
