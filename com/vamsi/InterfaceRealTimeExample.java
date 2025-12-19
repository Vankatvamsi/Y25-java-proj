package com.vamsi;
interface DataBase{
	//only abstract methods.....
	void connect();
	void disconnect();	
}
class Oracle implements DataBase
{

	@Override
	public void connect() {
		System.out.println("I want to connect to Oracle DataBase");
	}

	@Override
	public void disconnect() {
		System.out.println("I want to disconnect from Oracle DataBase");
		
		
	}
	
}
class Mysql implements DataBase{

	@Override
	public void connect() {
		System.out.println("I want to connect to Mysql DataBase");
		
	}

	@Override
	public void disconnect() {
		System.out.println("I want to disconnect from Mysql DataBase");
		
	}
	
}
public class InterfaceRealTimeExample {

	public static void main(String[] args) {
		Oracle O1=new Oracle();
		O1.connect();
		O1.disconnect();
		Mysql M1=new Mysql();
		M1.connect();
		M1.disconnect();

	}

}
