package com.ilp.basicprogrammingassignment;

import java.util.Scanner;

public class BasicProgrammingQuestion18 {

	public static void main(String[] args) {
		System.out.println("\n***** PROGRAM TO PRINT THE FIBONACCI SERIES:******* \n\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range of the series");
		int rangeVariable = scanner.nextInt();
		int firstNumber = 0;// to get the first two number
		int secondNumber = 1;

		System.out.print(firstNumber + "\t" + secondNumber + "\t");
		for (int count = 3; count <= rangeVariable; count++) {// loop begin from 3rd index position
			int thirdNumber = firstNumber + secondNumber;
			System.out.print(thirdNumber + "\t");
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}

	}

}
