package com.vamsi;
class Teacher
{
	int id;
	String name;
	double sal;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getSal() 
	{
		return sal;
	}
	public void setSal(double sal) 
	{
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
public class IheritanceRequirement 
{
	public static void main(String[] args) 
	{
		/*Teacher t1=new Teacher();
		t1.setId(1569);
		t1.setName("Vamsi");
		t1.setSal(1588.25);
		System.out.println("ID of the teacher:"+t1.getId());
		System.out.println("Name of the teacher:"+t1.getName());
		System.out.println("Salary of the teacher:"+t1.getSal());
		Student s1=new Student*/
		Student s1=new Student();
		s1.setId(1256);
		s1.setName("Vamsi");
		s1.setSal(1256.124);
		s1.setMarks(98.12);
		System.out.println("ID:"+s1.getId());
		System.out.println("Name:"+s1.getName());
		System.out.println("Salary:"+s1.getSal());
		System.out.println("Marks of the student:"+s1.getMarks());
	}

}
