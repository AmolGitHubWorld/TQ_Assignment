package Test4_Inheritance_abstractclass_interface_30thAp;

public class VP extends Employee
{
	public VP(String name, String address, int age,
			int empId, float basic, float hra, float da) 
	{
		super(name, address, age, empId, basic, hra, da);
	}
	public void calculatesalary()
	{
		grossSalary = basic+hra+da;
	}
}
