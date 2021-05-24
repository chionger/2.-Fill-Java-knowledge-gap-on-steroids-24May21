package com.hsa.human;

public class Client {
// visibility level - public (anywhere), private (within class), 
// default, protected
	
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setAge(500);
		person.setName("Invincible ");
		person.eat(" vegetarian food - salad");
		person.personDetails();
//output is "nulleats the foodvegetarian food - salad"
//needs to refactor to provide getter an setter
//function to use in Eclipse is encapsulate
		Person alice = new Person();
		alice.setName("Alice");
		alice.eat("fish");
		alice.setAge(22);
		alice.personDetails();
		
		Person tomPerson = new Person();
		tomPerson.setName("Tom");
		tomPerson.eat("beef");
		tomPerson.setAge(45);
		tomPerson.personDetails();
		
	}
}

//Why need getter and setter ?

