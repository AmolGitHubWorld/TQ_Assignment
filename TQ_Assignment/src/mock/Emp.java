package mock;
import com.day16_1304.Student;
public class Emp 
{
	int empId;
	String empName;
	double empSalary;
	
	public void empSalary(int empid,String empname,double empsalary) 
	{
		empId=empid;
		empName=empname;
		empSalary=empsalary;		
	}
	
	public void show_Emp_Details() 
	{
		System.out.println("Emp id is"+empId);
		System.out.println("Emp name is"+empName);
		System.out.println("Emp salary is"+empSalary);
	}
	
	public int salary() 
	{
		return (int) empSalary;
		
	}
	
	public static void main(String[] args) 
	{
		Emp e = new Emp();
		e.empSalary(101, "Ranjan", 122233.34);
		e.show_Emp_Details();
		
		// id name salary
		//salary()
	}

}
