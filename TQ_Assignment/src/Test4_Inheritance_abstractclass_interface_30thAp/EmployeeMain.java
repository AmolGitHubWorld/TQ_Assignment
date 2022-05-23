package Test4_Inheritance_abstractclass_interface_30thAp;

public class EmployeeMain {

	public static void main(String[] args) {
		VP obj = new VP("Anand", "Pune", 25, 101, 42000, 11400, 12000);
		obj.calculatesalary();
		obj.showEmployeeDetails();
		obj.payTax();

	}

}
