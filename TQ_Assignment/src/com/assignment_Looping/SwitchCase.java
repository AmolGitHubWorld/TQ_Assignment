package com.assignment_Looping;

import java.util.Scanner;

public class SwitchCase 
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("_____________Weekend Picknick_______________");
	System.out.println("How many participant are ready for going to picknick : ");
	int p =sc.nextInt();
	System.out.println("No.of parcipant going to picknick - "+p);
	
	switch(p) 
	{
		case 4: System.out.println("Let's Arrange car");
				break;
		case 8: System.out.println("Let's Arrange Innova car");
				break;
		case 15: System.out.println("Let's Arrange Mini bus ");
				break;
		case 20: System.out.println("Let's Arrange Traveller bus ");
				break;
		default: System.out.println("Invalid participant");
	}
	System.out.println("**************Enjoy your weekend*******************");
	}

}
