package com.assignment_Looping;

import java.util.Scanner;

public class For_loop_ex1 
{

	public static void main(String[] args) 
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter no");
		//int no=sc.nextInt();
		int no=0;
		for(int i=1;i<=10;i++) 
		{
			System.out.println("Display no."+(no=no+1));
		}
	}

}
