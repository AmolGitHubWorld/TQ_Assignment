package com.assignment_merthodoverloading;

class Banking
{
	protected void doTransaction() 
	{
		System.out.println("Transaction done successfully.....offline");
	}
}
class Online extends Banking
{
	public void doTransaction() 
	{
		super.doTransaction();
		System.out.println("Transaction done successfully.....Online");
	}
}

public class Overloading 
{

	public static void main(String[] args) 
	{
		
		Online o =new Online();
		o.doTransaction();
			
		
	}

}
