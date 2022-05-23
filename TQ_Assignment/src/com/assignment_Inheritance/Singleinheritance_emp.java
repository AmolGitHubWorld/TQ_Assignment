package com.assignment_Inheritance;
public class Singleinheritance_emp 
{

	public static void main(String[] args) 
	{
		System.out.println("Manager Details is given below.............");
		Manager m = new Manager(); 
		m.getEmpDetails(101, "amol", 45000.00f);
		m.setIncentive(2000.00f);
		m.showMngrDetails();
		
	
	}

}
