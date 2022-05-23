package Test4_Inheritance_abstractclass_interface_30thAp;

public class Employee extends Person implements TaxPayer
{
	int empId;
	float basic, hra, da, grossSalary;
	
	public Employee(String name, String address, int age,
			int empId, float basic, float hra, float da) 
	{
		getDetails(name,address,age);
		this.empId =  empId;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
	}
	public void showEmployeeDetails() 
	{
		System.out.println("Emp Id : "+empId);
		showDetails();
		System.out.println("gross salary : "+grossSalary);
	}
	public void calculateSalary()
	{
		grossSalary = basic+hra+da;
	}
	public void payTax() 
	{
		if(grossSalary>=500000) 
		{
			System.out.println("pay tax of Rs. "+0.05f*grossSalary);
		}
		else 
		{
			System.out.println("no need to pay tax");
		}
	}

}
