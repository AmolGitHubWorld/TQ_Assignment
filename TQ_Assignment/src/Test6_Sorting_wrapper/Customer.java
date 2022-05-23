package Test6_Sorting_wrapper;

public class Customer {
	int custid;
	String custName;
	int custAge;
	String travelDate;
	int noOfSeats;
	
	public Customer() {}

	public Customer(int custid, String custName, int custAge,
			String travelDate, int noOfSeats) {
		this.custid = custid;
		this.custName = custName;
		this.custAge = custAge;
		this.travelDate = travelDate;
		this.noOfSeats = noOfSeats;
	}
	
	public String toString() {
		return "[custid=" + custid + ", custName=" +
				custName + ", custAge=" +custAge + ", travelDate="
				+ travelDate + ", noOfSeats=" + noOfSeats + "]\n";
	}
	

}
