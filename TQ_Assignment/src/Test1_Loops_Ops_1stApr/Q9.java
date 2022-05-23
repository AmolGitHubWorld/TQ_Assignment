//Q9.Write a program to print all numbers between 1 and 100 except the numbers which are divisible by 3 or 7. 	
package Test1_Loops_Ops_1stApr; 
public class Q9  
{
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++) 
		{
			if(i%3!=0 && i%7!=0) 
			{
				System.out.println(i);
			}
		}
	}		
				
}				
