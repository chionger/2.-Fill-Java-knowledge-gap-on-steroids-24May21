package com.hsa.UserInputConcept;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		
		while (repeatRunFlag==1) {
			System.out.println("Welcome to Vehicle Factory Programme");
			System.out.println("Press 11 to create bike object");
			System.out.println("Press 12 to create car object");
			System.out.println("Press 13 to create truck object");
		
		int userInput = scan.nextInt();
		
		if (userInput==11) {
			System.out.println("create bike");
				
			} else if (userInput==12){
				System.out.println("create car");
			
				} else if (userInput==13){
					System.out.println("create truck");
			
					} else {
						System.out.println("Input is out of range: ");
					}
		
		System.out.println("\n $$$$$$$$$$$");
		System.out.println("\n Press 1 to re-run, 0 to Exit");
		try {
			repeatRunFlag = scan.nextInt();
			System.out.println(repeatRunFlag);
		}	catch (Exception e) {
			repeatRunFlag=0;
			System.out.println(repeatRunFlag);
//			scan.close();
			}
		
		}
//		scan.close();
	}
}
