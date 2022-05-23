package com.assignment_oops;
class B
{
	private int val1;
	private String val2;
	
	public int getValue1() 
	{
		return val1;
	}

	public void setValue1(int value1) 
	{
		val1=value1;
	}
	
	
	public String getValue2() 
	{
		return val2;
	}
	
	public void setValue2(String value2) 
	{
		val2=value2;
	}
}

	
public class Getter_Setter_ex
	
	{
	
		public static void main(String[] args) 
		{
	
			B obj = new B();
			obj.setValue1(50);
			obj.setValue2("abc");
			
			System.out.println("Val1 is : "+obj.getValue1());
			System.out.println("Val1 is : "+obj.getValue2());

			
		}
	
	}
