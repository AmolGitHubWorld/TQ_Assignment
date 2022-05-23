package com.assignment_hashcode;

public class Student 
{
	int roll;
	String name;
	
public  Student() 
{
	
}
public Student(int roll, String name) 
{
	this.roll=roll;
	this.name=name;
	
}
public String toString() 
{
	String str="Student roll is "+roll+"\nStudent name is"+name;
	return str;
}
	public static void main(String[] args) 
	{
		Student s = new Student(123,"amol");
		System.out.println("Hashcode of S is "+s.hashCode());
		System.out.println(s);
	}

}
