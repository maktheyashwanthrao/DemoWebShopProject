package BasicPrograms;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the input number");
		int inputNumber = scr.nextInt();
		int Power = inputNumber* inputNumber;
		
		System.out.println("The Power of Given number is " + Power);
		

	}

}
