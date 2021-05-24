package com.hsa.human;
//created by hsa on 24May21
//This calss is responsibe to define a person


public class Person {
//compiler - add extends java.lang.object

//no constructor - compiler add Person()
//did not call super - compiler add super()
	
	private String name = null; 	
	private Integer age= null;
	
	// skip difference between argument and parameter
	// Argument - passed in by user - call time
	// Parameter - required by method - design time
	
	
	public void setAge(Integer age) {
		if (age<0) {
			System.out.println("Age cannot be negative.  Set to zero.");
			this.age=0;
			return;				// if there is no return statement here, this.age = age would be executed and revert to wrongly entered age again !
			// return means return to caller function
		}
		
		if (age > 100){
			System.out.println("Age cannot be > 100.  Set to 40.");
			this.age=40;
			return;				// if there is no return statement here, this.age = age would be executed and revert to wrongly entered age again !
			// return means return to caller function
		}
		
		this.age = age;
	}

	private String food =null;
	
	public void eat(String food) {
		this.food = food;
//did not directly access non-static variable or method by their name
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void personDetails() {
		System.out.println("Name " + name + " has age " + age + " and " + food);
	}
}
