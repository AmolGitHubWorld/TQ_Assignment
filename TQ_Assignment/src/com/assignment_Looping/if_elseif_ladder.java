package com.assignment_Looping;

import java.util.Scanner;

public class if_elseif_ladder 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks : ");
		int m =sc.nextInt();
		
		if(m>=0 && m<=100) 
		{
			if(m>=80 && m<=100) 
			{
				System.out.println("Marks with A+ grade");
			}
			else if(m>=60 && m<=79) 
			{
				System.out.println("Marks with A grade");
			}
			else if(m>=40 && m<=59) 
			{
				System.out.println("Marks with B grade");
			}
			else if(m>=35 && m<=39) 
			{
				System.out.println("Marks with c grade");
			}
			else
			{
				System.out.println("Student is faill");
			}
		}
		else
		{
			System.out.println("Invalid marks");
		}

	}

}
