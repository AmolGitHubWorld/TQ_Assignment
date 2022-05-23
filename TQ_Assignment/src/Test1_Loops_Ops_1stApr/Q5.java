//Q5.Write Java code to generate following pattern.
//1234  
//123
//12
//1
package Test1_Loops_Ops_1stApr;

public class Q5 
{

	public static void main(String[] args)
	{
		for(int i = 4; i>=1; i--)
		{

			for(int j=1; j<=i; j++)
	
			System.out.print(j);
	
			System.out.println("\n");

		}
	
	}

}
