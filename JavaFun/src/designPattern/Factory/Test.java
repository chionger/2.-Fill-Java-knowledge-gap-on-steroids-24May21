package designPattern.Factory;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter first number ");
		double num1 = inputScanner.nextDouble();
		
		System.out.println("Enter second number ");
		double num2 = inputScanner.nextDouble();

		System.out.println("Enter calculation needed i.e.  Add, Subtract or Divide");
		CalculateFactory factory = new CalculateFactory();
		Calculate obj = factory.getCalculation(inputScanner.next()); //crucial 
		obj.calculate(num1, num2);
	}
}
