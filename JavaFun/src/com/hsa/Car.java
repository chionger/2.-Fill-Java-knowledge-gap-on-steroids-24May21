package com.hsa;

public class Car {
	private String color;
	private int doors;
	private double price;
	private String make;
	private String model;
	private double mileage;

	//Separate between properties that change and those that do not
	//Use those that do not in constructor
	//Provide getters and setters for the others
	
	public Car(String make,String model) {
		this.make = make;
		this.model = model;
	}

	public String getMake(){
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public double getMileage() {
		return this.mileage;
	}
	
	public String toString() {
		return ("Car make is " + make + "\nModel is "+ model);
	}
}