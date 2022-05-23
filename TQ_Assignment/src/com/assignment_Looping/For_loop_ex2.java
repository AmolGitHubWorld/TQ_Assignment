package com.assignment_Looping;

import java.util.Scanner;

public class For_loop_ex2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int no=sc.nextInt();
		
		for(int i=1;i<=10;i++) 
		{
			System.out.println("Table of given no is : "+no*i);
		}

	}

}
