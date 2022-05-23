package com.assignment_accessSpecifiers;

public class Account 
{
	private int acc;
	private String name;
	private float balance;
	
	
	private void customerDetails(int ac, String nm, float b) 
	{
		acc=ac;
		name=nm;
		balance=b;
	}
	
	public void openAccount() 
	{
		customerDetails(1234567,"Amol",5000.0f);
		
	}
	
	//void means accessible within a package only
	void showAccountDetails() 
	{
		System.out.println("Customer name is : "+name);
		System.out.println("Customer name is : "+acc);
		System.out.println("Customer name is : "+balance);
	
	}
	

}
