//Q2. Write Java Program to find highest digit among the digits forming a number. 
//E.g. If number given is 6745, then output should be 7.
package Test1_Loops_Ops_1stApr;

import java.util.Scanner;

public class Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the no");
		int num = sc.nextInt();
		int reminder,highest=0;
		while(num>0)
		{
			reminder=num%10;
			if(highest<reminder)
			{
				highest=reminder;
			}
			num=num/10;
			
		}
		System.out.println("highest digit is "+highest);

	}

}
