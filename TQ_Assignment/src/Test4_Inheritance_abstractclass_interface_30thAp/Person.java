package Test4_Inheritance_abstractclass_interface_30thAp;

public class Person {
	String name;
	String address;
	int age;
	
	public void getDetails(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public void showDetails() {
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Age : "+age);
	}

}
