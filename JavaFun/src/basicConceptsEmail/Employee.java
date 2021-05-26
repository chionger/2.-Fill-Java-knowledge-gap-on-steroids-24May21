package basicConceptsEmail;

public class Employee {

	int empID;
	String empNameString;
	double salary;
	int grade;
	String companyString = "HSA";

	Email email;  //not defined.  No compilation error but would have runtime error.  Therefore, ensure that it is in constructor.
	
	public Employee(int empID, String empName, Email email) {
		this.empID = empID;
		this.empNameString = empName;
		this.email = email;  //if forget to set, will have runtime error because used in subsequent methods.
	}
	
	public void notifyEmployee() {
		email.sendEmail();
	}
}
