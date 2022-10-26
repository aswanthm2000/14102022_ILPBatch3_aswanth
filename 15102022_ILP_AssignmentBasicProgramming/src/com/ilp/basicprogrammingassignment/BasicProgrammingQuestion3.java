package com.ilp.basicprogrammingassignment;

import java.util.Scanner;

public class BasicProgrammingQuestion3 {

	public static void main(String[] args) {
		System.out.println("\n***** PROGRAM TO CALCULATE THE SUM OF THE SERIES:1-3+5-7+....n *******\n\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range of the series");
		int rangeVariable = scanner.nextInt();
		int valueTracker = 1;
		int positionTracker = 1;
		int seriesSum = 0;
		for (int count = 1; count <= rangeVariable; count++) {
			if (positionTracker % 2 == 0)
				seriesSum = seriesSum - valueTracker;
			else
				seriesSum = seriesSum + valueTracker;
			valueTracker += 2;
			positionTracker += 1;

		}
		System.out.println("Sum of series is:" + seriesSum);
		// TODO Auto-generated method stub

	}

}
