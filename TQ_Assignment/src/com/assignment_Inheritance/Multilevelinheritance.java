package com.assignment_Inheritance;

public class Multilevelinheritance 
{

	public static void main(String[] args) 
	{
		System.out.println("SalesManager Details is given below.............");
		SaleManager m1 = new SaleManager(); 
		m1.getEmpDetails(102, "Rahul", 475000.00f);
		m1.setIncentive(2000.00f);
		m1.setTarget(5000);
		m1.showSaleManager();

	}

}
