package com.ilp.basicprogrammingassignment;

import java.util.Scanner;

public class BasicAssignment16 {

	public static void main(String[] args) {
		System.out.println("frequency of character in a string and replace it with new character");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String inputString = scanner.nextLine();
		System.out.println("Enter the character to replace");
		char replaceChar = scanner.next().charAt(0);
		System.out.println("Enter the new character to be replaced");
		char newChar = scanner.next().charAt(0);
		int frequencyCount = 0;
		String newString = "";
		for (int index = 0; index < inputString.length(); index++) {
			if (inputString.charAt(index) == replaceChar) {
				frequencyCount++;
				newString = inputString.replace(inputString.charAt(index), newChar);
			}

		}
		if (frequencyCount == 0)
			System.out.println("The character is not found");
		else
			System.out.println("The character occur is: " + frequencyCount + "/nNew string after replacement is:"
					+ newString);

	}

}

