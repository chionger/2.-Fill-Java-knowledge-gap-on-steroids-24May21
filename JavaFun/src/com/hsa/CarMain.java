package com.hsa;
// version 1 - rudimentary
// can adopt factory pattern
import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter car make: ");
		String make = sc.next();
		System.out.println("Enter car model: ");
		String model = sc.next();
		sc.close();
		
		Car car = new Car(make, model);

		System.out.println(car);
	}

}
