package com.ilpexperion.basicprogramming;

import java.util.Scanner;
public class SecondLargeNumber {

	public static void main(String[] args) {
		
		int firstNumber;	
		int secondNumber;
		int thirdNumber;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter first number");
		firstNumber=scanner.nextInt();
		System.out.println("enter second number");
		secondNumber=scanner.nextInt();
		System.out.println("enter third number");
		thirdNumber=scanner.nextInt();
		if((firstNumber>secondNumber)&&(firstNumber>thirdNumber))
		{
			if(secondNumber>thirdNumber)
				System.out.println("second largest is"+ secondNumber);
			else
				System.out.println("second largest is"+ thirdNumber);	
		}	
		if((secondNumber>firstNumber)&&(secondNumber>thirdNumber))
				{
					if(firstNumber>thirdNumber)
						System.out.println("second largest is"+ firstNumber);
					else
						System.out.println("second largest is"+ thirdNumber);
					}
		if((thirdNumber>firstNumber)&&(thirdNumber>secondNumber)){
			if(firstNumber>secondNumber)
				System.out.println("second largest is"+ firstNumber);
			else
				System.out.println("second largest is"+ secondNumber);
			}
		
	}	
	}


