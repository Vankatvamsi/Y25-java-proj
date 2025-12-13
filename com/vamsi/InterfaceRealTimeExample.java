package com.vamsi;
interface DataBase
{
	//only abstract methods
	void connect();
	void disconnect();
}
class Oracle implements DataBase
{
	@Override
	public void connect() 
	{
		System.out.println("Connect to Oracle DataBase");
	}
	@Override
	public void disconnect() 
	{
		System.out.println("Disconnect from Oracle Database");
	}
}
class Mysql implements DataBase
{
	@Override
	public void connect() 
	{
		System.out.println("Connect to Mysql DataBase");
		
	}
	@Override
	public void disconnect()
	{
		System.out.println("Disconnect from Mysql DataBase");
	}
}
public class InterfaceRealTimeExample 
{
	public static void main(String[] args) 
	{
		Oracle or=new Oracle();
		or.connect();
		or.disconnect();
		Mysql my=new Mysql();
		my.connect();
		my.disconnect();
	}
}
