package com.ilp.basicprogrammingassignment;

import java.util.Arrays;
import java.util.Scanner;

public class BasicProgrammingQuestion15 {

	public static void main(String[] args) {
		System.out.println(
				"\n***** PROGRAM TO REMOVE DUPLICATE ELEMENTS IN AN ARRAY:******* \n\n");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int rangeVariable = scanner.nextInt();
		int numbers[] = new int[rangeVariable];
        
		System.out.println("Enter the array elements numbers");
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = scanner.nextInt();
		}

		Arrays.sort(numbers);

		
		int frequencyCount=0;
		
		for (int index = 0; index < numbers.length; index++) {
			
			
			frequencyCount=1;
			
			for (int innerIndex = index + 1; innerIndex < numbers.length; innerIndex++) {
				if (numbers[index] == numbers[innerIndex]) {
					frequencyCount++;
					numbers[innerIndex]=-1;
				}
					
				else
					break;

			}
			
			index += frequencyCount - 1;
		}
		
		
		System.out.println("Unique elements are");
		for(int number:numbers)
		{
			if(number!=-1)
			System.out.print(number+"\t");
		}
		// TODO Auto-generated method stub

	}

}
