package com.ilp.basicprogrammingassignment;

import java.util.Scanner;

public class BasicProgrammingQuestion5 {

	public static void main(String[] args) {
		System.out.println("\n***** PROGRAM TO CALCULATE THE SUM OF THE SERIES:1^1-3^2+5^3-7^4+....n^n *******\n\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range of the series");
		int rangeVariable = scanner.nextInt();
		int valueTracker = 1;
		int positionTracker = 1;
		double seriesSum = 0;
		for (int count = 1; count <= rangeVariable; count++) {
			if (positionTracker % 2 == 0)
				seriesSum = seriesSum - Math.pow(valueTracker, count);
			else
				seriesSum = seriesSum + Math.pow(valueTracker, count);
			valueTracker += 2;
			positionTracker += 1;

		}
		System.out.println("Sum of series is:" + seriesSum);
		// TODO Auto-generated method stub

	}

}
