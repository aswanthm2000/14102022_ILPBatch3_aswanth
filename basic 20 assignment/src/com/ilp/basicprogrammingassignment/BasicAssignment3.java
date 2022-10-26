package com.ilp.basicprogrammingassignment;

import java.util.Scanner;

public class BasicAssignment3 {

	public static void main(String[] args) {
		System.out.println("calculate sum of series -3+5-7+....n ");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range of the series");
		int range= scanner.nextInt();
		int baseValue = 1;
		int powerValue= 1;
		int Sum = 0;
		for (int count = 1; count <= range; count++) {
			if (powerValue % 2 == 0)
				Sum = Sum - baseValue;
			else
				Sum = Sum + baseValue;
			baseValue += 2;
			powerValue += 1;

		}
		System.out.println("Sum of series is:" + Sum);

	}

}
