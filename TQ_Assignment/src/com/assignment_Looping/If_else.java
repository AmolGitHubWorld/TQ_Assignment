package com.assignment_Looping;

import java.util.Scanner;

public class If_else 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		int a=sc.nextInt();
		
		
		if(a>=40) 
		{
			System.out.println("Entered no is greater than given no");
		}
		else 
		{
			System.out.println("Entered no is small");
		}
	}

}
