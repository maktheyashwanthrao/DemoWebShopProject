package BasicPrograms;

import java.util.Scanner;

public class QuotientandRemainder {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int FirstNumber =scr.nextInt();
		
		System.out.println("Enter the Secound Number");
		int SecoundNumber =scr.nextInt();
		
		int quotient = FirstNumber / SecoundNumber;
        int remainder = FirstNumber % SecoundNumber;
        
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);

	}

}
