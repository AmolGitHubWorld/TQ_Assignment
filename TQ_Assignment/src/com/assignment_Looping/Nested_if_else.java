package com.assignment_Looping;

import java.util.Scanner;

public class Nested_if_else 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no : ");
		int a=sc.nextInt();
		
		if(a>0 && a<100) 
		{
			
			if(a>=40) 
				{
					System.out.println("no. is greater than given no");	
				}
			else 
				{
					System.out.println("no.is small");
				}
		}	
		else
			{
				System.out.println("no.is Invalid");
			}
		
	}

}
