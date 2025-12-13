package com.vamsi;
class emp5
{
	void display()
	{
		System.out.println("object equals method");
	}
}

public class ObjectEqualsMethodImpl 
{

	public static void main(String[] args) 
	{
		emp5 e1=new emp5();
		emp5 e2=new emp5();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		if(e1.equals(e2))
		{
			System.out.println("two objects are equal");
		}
		else
		{
			System.out.println("two objects are not equal");
		}
		if(i1.equals(i2))
		{
			System.out.println("two objects are equal");
		}
		else
		{
			System.out.println("two objects are not equal");
		}
	}

}
