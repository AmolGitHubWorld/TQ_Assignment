//Q6. Write a code in java to display small alphabets in reverse order ie. from z,y,x…..b,a.   
package Test1_Loops_Ops_1stApr;

public class Q6 
{

	public static void main(String[] args) 
	{
		char ch;
		for (ch='z';ch>='a';ch--)
		{
			System.out.println(ch);
		}
		System.out.println("\n");	
	}

}
