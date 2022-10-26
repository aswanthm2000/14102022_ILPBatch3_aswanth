package com.ilp.basicprogrammingassignment;

import java.util.Scanner;

public class BasicAssignment4 {

	public static void main(String[] args) {
		System.out.println("calculate sum of series  1^3+2^3+5^3+....n^3 *******\n\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range of the series");
		int rangeVariable = scanner.nextInt();
		int firstNumber = 1;
		int secondNumber = 2;
		int thirdNumber = firstNumber + secondNumber;
		double Sum = 0;
		Sum = Math.pow(firstNumber, 3) + Math.pow(secondNumber, 3);
		for (int count = 3; count <= rangeVariable; count++) {
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
			thirdNumber = firstNumber + secondNumber;
			Sum = Sum + Math.pow(secondNumber, 3);

		}

		System.out.println("Series sum is   " + Sum);

	}

}
