package com.assignment_Inheritance;
public class Employee 
{
	// Instance Variables
	int empid;
	String empName;
	float salary;
	
	//Parameter Constructor
	public void getEmpDetails(int empid,String empName,float salary)
	{
		this.empid=empid;
		this.empName=empName;
		this.salary=salary;
	}
	//show emp.method
	protected void showEmpDetails() 
	{
		System.out.println("Emp.Name is:"+empName);
		System.out.println("Emp.ID is:"+empid);
		System.out.println("Emp.Salary is:"+salary);
	}
	//toString method for concatenate this method automatically call.
	public String toString()
	{
		String str="Employee Name:"+empName+
					"\tEmployee ID"+empid+
					"Employee Salary"+salary;
		return str;
	}
	
}	
//Single Inheritance.
class Manager extends Employee
{
	float incentive;
	
	//Setter method.
	public void setIncentive(float val) 
	{
		incentive=val;
	}
	//Getter method.
	public float getIncentive() 
	{
		return incentive;
	}
	//Show manager Details Method.
	public void showMngrDetails() 
	{
		showEmpDetails();
		System.out.println("Incentive is Rs:"+getIncentive());
	}
		
}
//Multilevel Inheritance.
class SaleManager extends Manager
{
	float target;
	
	//Setter method.
	public void setTarget(float val) 
	{
		target=val;
	}
	//Getter method.
	public float getTarget() 
	{
		return target;
	}
	//SaleManager Details Method.
	public void showSaleManager() 
	{
		showMngrDetails();
		System.out.println("target Achived 2022 is Rs:"+getTarget());
	}
		
}

	
	
	
	
	
	
	
	
	
	
	


