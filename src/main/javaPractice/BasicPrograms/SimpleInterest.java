package BasicPrograms;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Principal Amoubt");
		int principalAmount =scr.nextInt();
		
		System.out.println("Enter the RateOfInterest");
		int RateOfInterest =scr.nextInt();
	
		System.out.println("Enter Time");
		int Time =scr.nextInt();
		
		

		int SimpleInterest = principalAmount*RateOfInterest*Time/100;
		System.out.println("Simple Interest for given inputs is " + SimpleInterest);
	}

}
