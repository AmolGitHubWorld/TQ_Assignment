package com.assignment_Looping;

import java.util.Scanner;

public class For_continue_break_combination 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int no=sc.nextInt();
		
		for(int i=1;i<=10;i++) 
		{
			if(i==5)
				continue;
			if(i==8)
				break;
			System.out.println("Table of given no is : "+no*i);
		}
	}

}
