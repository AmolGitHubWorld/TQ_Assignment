package Test2_1DArray_9thApr;
import java.util.Scanner;
public class Q1 
{
	Scanner sc =new Scanner (System.in);
	public static void main(String[] args) 
	{
	System.out.println("Enter 6 digit no.:");
	int no = 784867;
	int digit1=no/100000%10;
	int digit2=no/10000%10;
	int digit3=no/1000%10;
	int digit4=no/100%10;
	int digit5=no/10%10;
	int digit6=no%10;
	System.out.println(digit1+","+digit2+","+digit3+","+digit4+","+digit5+","+digit6);
	}

}
