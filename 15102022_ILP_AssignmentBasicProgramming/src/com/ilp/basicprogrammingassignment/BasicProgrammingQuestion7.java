package com.ilp.basicprogrammingassignment;

import java.util.Scanner;

public class BasicProgrammingQuestion7 {
	
	
	public double factorial(int count1) {
		double factVariable = 1;
		for (int index = 1; index <= count1; index++) {
			factVariable = factVariable * index;
		}
		return factVariable;
	}

	public void displaySum() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range of the series");
		int rangeVariable = scanner.nextInt();

		double seriesSum = 0.0;
		for (int count = 1; count <= rangeVariable; count++) {
		
			seriesSum = seriesSum + (count / factorial(count*count));
			
		}
		System.out.println("Sum of series is:" + seriesSum);
		// TODO Auto-generated method stub

	}


	public static void main(String[] args) {
		System.out.println("\n***** PROGRAM TO CALCULATE THE SUM OF THE SERIES:1/1!+2/4!+3/9!+....n/n^2f! *******\n\n");
		BasicProgrammingQuestion7 fact = new BasicProgrammingQuestion7();
		fact.displaySum();
		
		// TODO Auto-generated method stub

	}

}
