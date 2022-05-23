package mock;

public class Even 
{

	public static void main(String[] args) 
	{
		// no.is 8927 addition of even no..ie 8+2=10
		int sum=0;
		int n=8927;
		
		while (n!=0) 
		{
			int a=n%10;
			System.out.println("no is divisble by 10"+a);
			if (a%2==0) 
			{
				
				sum=sum+a;
			}
			    n=n/10;
			
			
//			else 
//				System.out.println("no is odd");
		}
		System.out.println(sum);

	}

}
