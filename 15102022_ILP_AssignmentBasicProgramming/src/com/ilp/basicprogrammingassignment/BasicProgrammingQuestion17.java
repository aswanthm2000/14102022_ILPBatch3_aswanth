package com.ilp.basicprogrammingassignment;

import java.util.Scanner;

public class BasicProgrammingQuestion17 {

	public static void main(String[] args) {
		System.out.println("\n***** PROGRAM TO COUNT THE NUMBER OF WORDS IN A STRING:******* \n\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String");
		String inputString = scanner.nextLine();
		if (inputString.isEmpty())
			System.out.println("String is empty");
		else {
			String[] wordArray = inputString.split("\\s+");// to split based on whitespace
			System.out.println("The number of words in the string is\n" + wordArray.length);
		}

	}

}
