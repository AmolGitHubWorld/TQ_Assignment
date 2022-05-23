package com.assignment_final_access;

//final is fixed value we could not change once we declared i.e universal value.
// final is declared as per industry all letters in capital. mentioned  in line no. 36


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

final public void  showrecords() 
{
	System.out.println("I am in showrecords method");
}


	public static void main(String[] args) 
	{
		final int VALUE =90;
		Student s = new Student(123,"amol");
		System.out.println(s);
		System.out.println(VALUE);
	}

}

class CollegeStudent extends Student
{
	
	public void  showrecords() // error for final key word.
	{
		System.out.println("I am in showrecords in college Student class method");
	}
	
}