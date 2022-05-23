//Q3.Write Java Code to generate output as Specified…
//eg.Given number is 345 then show output of 3^1 +  4^2 +  5^3 so, 3+16+125 i.e. 144 
package Test1_Loops_Ops_1stApr;

import java.util.Scanner;

public class Q3 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enter no.:");
		int num =sc.nextInt();
		int rev = 0;
		int mod,sum=0;
		for (int i=0;num>0;i++)
		{
			mod=num%10;
			rev = rev*10 + mod;
			num = num/10;
		}
		for (int i=1;rev>0;i++) 
		{
			int j=i;
			int mul=1;
			mod=rev%10;
			while(j>0) 
			{
				mul*=mod;
				j--;
				
			}
			sum=sum+mul;
			rev=rev/10;
		}
		System.out.println(sum);
	}
	

}
