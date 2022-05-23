package com.assignment_Looping;

import java.util.Scanner;

public class Account_if_elseif 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);	
		System.out.println("<-------------WELCOME TO ICICI BANK------------------>");
		System.out.println("Enter acc. holder age is : ");
		int ac =sc.nextInt();
		System.out.println("Enter acc. holder city : ");
		char c =sc.next().charAt(0);
		
		if(ac>=0 && ac<=100 ) 
		{
			if(ac>=80 && c=='p') 
			{
				System.out.println("Eligible for acc.opening because you belonging to pune ");	
			}
			else if(ac>=80 && c=='T') 
			{
				System.out.println("Eligible for acc.opening because you belonging to Thane ");	
			}
			else
			{
				System.out.println("You are not Eligible for acc.opening because you belonging to Different city");
			}
			System.out.println("Thanks for visiting.......... ");
		}
		else 
		{
			System.out.println("Invalid age");
		}
		
		
	}
	

}
