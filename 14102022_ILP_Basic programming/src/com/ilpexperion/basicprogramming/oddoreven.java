package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
	int firstNumber;
	
	System.out.println("enter first number");
	firstNumber=scanner.nextInt();
	if(firstNumber%2==0)
	{
	System.out.println("last digit is even");
	}
	else
	{
	System.out.println("last digit is odd");
	}
	}

}
