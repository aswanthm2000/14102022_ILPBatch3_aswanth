package com.ilp.basicprogrammingassignment;

import java.util.Scanner;

public class BasicProgrammingQuestion9 {

	public static void main(String[] args) {
		System.out.println(
				"\n***** PROGRAM TO PRINT THE PATTERN:*******\n1\n1\t2\n1\t2\t3\t\n1\t2\t3\t4 \n\n");

		int rangeVariable;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range");
		rangeVariable = scanner.nextInt();
		for (int row = 1; row <= rangeVariable; row++) {
			for (int value = 1; value <= row; value++) {
				System.out.print(value + "  ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
