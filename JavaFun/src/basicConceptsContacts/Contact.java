package basicConceptsContacts;

public class Contact {
	
	public String name;
	
	public String toString() {
	
		String temp = "";
		
		if(this instanceof Friend) {
			temp = "Friend Name: " + name + " Ph: " + ((Friend)this).phonenumber;
		} else if (this instanceof WorkContact) { 
			
			temp = "Work Name: " + name + " Email: " + ((WorkContact)this).email;
	}
		return temp;
	}
}
