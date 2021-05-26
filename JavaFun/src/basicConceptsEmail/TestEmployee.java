package basicConceptsEmail;

public class TestEmployee {

	
	public static void main(String[] args) {
		
		Email email = new OutlookEmail();  //superclass object = new subclass
		Employee employee1 = new Employee(1, "Champion", email);	
		employee1.notifyEmployee();
		
		email = new WebServiceEmail();
		Employee employee2 = new Employee(2, "Lynda", email);
		employee2.notifyEmployee();
		
		System.out.println(employee1);
	}
}
