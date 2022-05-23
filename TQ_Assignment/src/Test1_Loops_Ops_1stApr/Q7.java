//Q7. Write a code show prime numbers between the range of given numbers. Accept range from user.
//Eg.Range given by user is 12 to 25 then out put should be 13,17,19,23.	    
package Test1_Loops_Ops_1stApr;
import java.util.Scanner;
public class Q7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Starting ");
		int i=sc.nextInt();
		int num=0;
		String primeNumbers = "";
		for (;i <= 25; i++)
		{
			int counter=0;
			for(num =i; num>=1; num--)
		{
		if(i%num==0)
			{
			counter = counter + 1;
			}
		}
		if (counter ==2)
			{
			primeNumbers = primeNumbers + i + " ";
			}
		System.out.println("Prime numbers from 12 to 25 is:");
		System.out.println(primeNumbers);
		}
	}
}
