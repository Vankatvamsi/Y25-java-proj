package com.vamsi;

interface Father
{
	float height=5.8f;
	void height();
}
interface Mother
{
	float height=5.6f;
	void height();
}
class Child implements Father,Mother
{
	float height=(Father.height+Mother.height)/2;

	@Override
	public void height() 
	{
		System.out.println("Father height= "+Father.height);
		System.out.println("Mother height= "+Mother.height);
		System.out.println("Child  height= "+height);
	}
	
}
public class MultipleInhertanceUsingInterface 
{
	
	public static void main(String[] args) 
	{
		Child ch=new Child();
		ch.height();
	}

}
