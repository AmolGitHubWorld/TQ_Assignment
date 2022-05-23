package Test2_1DArray_9thApr;

public class Q5 
{

	public static void main(String[] args) 
	{
		int []arr=new int[] {1,2,3,3,2};
		System.out.println("Duplicate elements in given array");
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		}
	}

}
