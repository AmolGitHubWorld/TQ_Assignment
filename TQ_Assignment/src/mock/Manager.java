package mock;

public class Manager {

	public static void main(String[] args) 
	{
		Emp e = new Emp();
		e.empSalary(101, "Ranjan", 122233.34);
		e.show_Emp_Details();
		int new_salary=e.salary()+5000;
		System.out.println(new_salary);
		// id name salary
		//salary()
	}

}
