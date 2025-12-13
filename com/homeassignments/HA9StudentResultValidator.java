package com.homeassignments;
class InvalidMarksException extends Exception 
{
    public InvalidMarksException(String message) 
    {
        super(message);
    }
}
class Student {
    private String name;
    private int marks;
    public Student(String name, int marks) throws InvalidMarksException {
        this.name = name;
        validateMarks(marks);
        this.marks = marks;
    }
    private void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }
    }
    public String getResult() {
        if (marks >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    @Override
    public String toString() {
        return "Student: " + name + ", Marks: " + marks + ", Result: " + getResult();
    }
}
public class HA9StudentResultValidator {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Alice", 85);
            System.out.println(s1);
            Student s2 = new Student("Bob", 35);
            System.out.println(s2);
            // This will throw an exception
            Student s3 = new Student("Charlie", 120);
            System.out.println(s3);
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}