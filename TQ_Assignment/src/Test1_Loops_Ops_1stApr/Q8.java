//Q8. You have 20 barrels of fuel. The price per barrel is 89rs. For the first 10 barrels. If someone wants more than 10 barrels, the price reduces by the number of barrels bought.
//For e.g. the price of 6 barrels is 6 * 89
//But price of 12 barrels is 12 * (89 - 12)
//or price of 18 barrels is 18 * (89 - 18) and so on.
//Display all the prices from 1 to 20 barrels. 		
package Test1_Loops_Ops_1stApr;

import java.util.Scanner;

public class Q8 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Barrel Qty:");
		int barrel=sc.nextInt();
		int price =0;
		for(int i=1;i<=barrel;i++) 
		{
		  if (i<=10)
		  {
			price=i*89;
			System.out.println("The price of"+i+"barrels is"+price);
		  }
		  else 
		  {
		  
			  price=i*(89-i);
			  System.out.println("The price of"+i+"barrels is"+price);
		  }
		
	    }

    }
}