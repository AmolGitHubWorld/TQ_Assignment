package com.assignment_Looping;

import java.util.Scanner;

public class Percentage_if_elseif 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("<--------------PCM GROUP PERCENTAGE--------------->");
		System.out.println("Enter chemistry marks : ");
		int c=sc.nextInt();
		System.out.println("Enter physics marks : ");
		int p=sc.nextInt();
		System.out.println("Enter math marks : ");
		int m=sc.nextInt();
		float total=c+p+m;
		float per=(100*total)/300;
		
		System.out.println("Percentage of in PCM Group is "+per+"%");
		
		if(per>80.00f) 
		{
			System.out.println("Grade A+");		
		}
		else if(per>70.00f) 
		{
			System.out.println("Grade A");		
		}
		else if(per>60.00f) 
		{
			System.out.println("Grade b");		
		}
		else if(per>50.00f) 
		{
			System.out.println("Grade c");		
		}
		else 
		{
			System.out.println("You are Failled......please apply for next time");		
		}
	}

}
