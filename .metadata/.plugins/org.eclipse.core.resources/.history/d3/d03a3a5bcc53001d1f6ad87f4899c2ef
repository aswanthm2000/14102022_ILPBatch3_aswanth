package com.ilp.basicprogrammingassignment;

import java.util.Scanner;

public class BasicProgrammingQuestion4 {

	public static void main(String[] args) {
		System.out.println("\n***** PROGRAM TO CALCULATE THE SUM OF THE SERIES:1^3+2^3+5^3+....n^3 *******\n\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range of the series");
		int rangeVariable = scanner.nextInt();
		int firstNumber = 1;
		int secondNumber = 2;
		int thirdNumber = firstNumber + secondNumber;
		double seriesSum = 0;
		seriesSum = Math.pow(firstNumber, 3) + Math.pow(secondNumber, 3);
		for (int count = 3; count <= rangeVariable; count++) {
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
			thirdNumber = firstNumber + secondNumber;
			seriesSum = seriesSum + Math.pow(secondNumber, 3);

		}

		System.out.println("Series sum:" + seriesSum);
		// TODO Auto-generated method stub

	}

}
