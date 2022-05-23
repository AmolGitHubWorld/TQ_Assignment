package com.assignment_Inheritance;
import java.util.Scanner;
//Hierarchical Inheritance.
class CEO extends Employee
{
	String share;
	
	//Setter method.
	public void setShare(String val) 
	{
		share=val;
	}
	//Getter method.
	public String getShare() 
	{
		return share;
	}
	//SaleManager Details Method.
	public void showCEODetails() 
	{
		showEmpDetails(); 
		System.out.println("No. of Share this Company:"+getShare());
	}
	
}

public class Hierarchicalinheritance 
{
	public static void main(String[] args) 
	{   //CEO obj.Created
		System.out.println("Company CEO Details Are Given Below........");
		CEO c= new CEO();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee name :");
		String empn=sc.nextLine();
		
		System.out.println("Enter Employee ID :");
		int empi=sc.nextInt();
		
		System.out.println("Enter Employee Salary :");
		float emps=sc.nextFloat();
		
		c.getEmpDetails(empi,empn,emps);
		c.setShare("1000 qty"); 
		c.showCEODetails();
		
		//Manager obj.created
		Manager ma=new Manager();
		System.out.println("Manager details : ");
		sc.nextLine();
		System.out.println("Enter Employee name : ");
		String empName = sc.nextLine();
		System.out.println("enter Employee Id : ");
		int empid = sc.nextInt();
		System.out.println("Enter emp. Salary : ");
		float salary = sc.nextFloat();
		
		ma.getEmpDetails(111, "Ramu", 111.00f);
		ma.setIncentive(3000.00f);
		ma.showMngrDetails();
		
	}

}
