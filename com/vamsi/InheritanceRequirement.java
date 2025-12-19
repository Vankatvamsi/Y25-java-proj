package com.vamsi;
class Teacher
{
	int id;
	String name;
	double sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
class Student extends Teacher
{
	
	double marks;
	
	
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
}

public class InheritanceRequirement 
{
	public static void main(String[] args) 
	{
		/*Teacher t1=new Teacher();
		t1.setId(1234);
		t1.setName("Balaya");
		t1.setSal(15000.25);
		System.out.println("id= "+t1.getId());
		System.out.println("name= "+t1.getName());
		System.out.println("salary= "+t1.getSal());*/
		Student s1= new Student();
		s1.setId(1256);
		s1.setName("Balaya");
		s1.setMarks(97.56);
		s1.setSal(10000.25);System.out.println("id= "+s1.getId());
		System.out.println("name= "+s1.getName());
		System.out.println("salary= "+s1.getSal());
		System.out.println("marks of student:"+s1.getMarks());

	}

}

