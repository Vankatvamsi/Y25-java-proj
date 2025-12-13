package com.vamsi;
class Person
{
	String name;
	int age;
	String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
public class ClassDemo {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Vamsi");
		p.setAge(17);
		p.setGender("M");
		System.out.println("Name of the person:"+p.getName());
		System.out.println("Age of person:"+p.getAge());
		System.out.println("Gender of the person:"+p.getGender());
	}
}