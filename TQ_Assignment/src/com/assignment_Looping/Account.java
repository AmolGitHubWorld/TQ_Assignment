package com.assignment_Looping;

import java.util.Scanner;

public class Account 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter acc.holder age : ");
		int age=sc.nextInt();
		
		if(age>=80 && age<80) 
			{
				System.out.println("You are eligible for acc.open");
				
			}
		else
			{
				System.out.println("You are not eligile for acc.open");
			}
		
			
	}
	

}
