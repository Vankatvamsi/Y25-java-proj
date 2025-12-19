package com.vamsi;
interface Father
{
	float height=5.8f;
	void height();
}
interface Mother{
	float height=5.6f;
	void height();
}
class Child implements Father,Mother{
	float height=(Father.height+Mother.height)/2;
	@Override
	public void height() {
		System.out.println("Father Height="+Father.height);
		System.out.println("Mother Height="+Mother.height);
		System.out.println("Child Height="+height);
		
	}
	
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Child c1=new Child();
		c1.height();
		}

}
