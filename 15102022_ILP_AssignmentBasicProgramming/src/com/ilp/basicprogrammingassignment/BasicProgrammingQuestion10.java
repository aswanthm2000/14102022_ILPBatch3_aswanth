package com.ilp.basicprogrammingassignment;

import java.util.Scanner;

public class BasicProgrammingQuestion10 {

	public static void main(String[] args) {
		System.out.println("\n***** PROGRAM TO PRINT THE PATTERN:*******\n1\n2\t3\n4\t5\t6\t\n7\t8\t9\t10 \n\n");

		int rangeVariable;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range");
		rangeVariable = scanner.nextInt();
		int patternValue = 1;
		for (int row = 1; row <= rangeVariable; row++) {
			for (int value = 1; value <= row; value++) {
				System.out.print(patternValue + "  ");
				patternValue++;
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
