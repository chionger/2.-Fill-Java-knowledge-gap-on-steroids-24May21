package basicConceptsContacts;

public class TestContact {

	public static void main(String[] args) {
		
		Contact contact1 = new Friend();
//		Friend contact = new Friend(); 
		//  will not be able to access phone number
		//  cast to Friend to resolve
		// left side gives restrictions, right side gives values
		contact1.name = "Alex";
		((Friend)contact1).phonenumber = "555";

		Contact contact2 = new WorkContact();
//		WorkContact contact2 = new WorkContact()
		//  will not be able to access email
		contact2.name = "Sara";
		((WorkContact)contact2).email = "sara@mail.com";
		
		System.out.println(contact1);
		System.out.println(contact2);
	}
}