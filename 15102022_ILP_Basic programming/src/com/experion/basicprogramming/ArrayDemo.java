package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		String productNames[]=new String[5];
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter first product name");
		productNames[0]=scanner.nextLine();
		System.out.println("enter second product name");
		productNames[1]=scanner.nextLine();
		System.out.println("enter third product name");
		productNames[2]=scanner.nextLine();
		System.out.println("enter fourth product name");
		productNames[3]=scanner.nextLine();
		System.out.println("enter fifth product name");
		productNames[4]=scanner.nextLine();
		System.out.println(productNames[0]);
		System.out.println(productNames[1]);
		System.out.println(productNames[2]);
		System.out.println(productNames[3]);
		System.out.println(productNames[4]);
	}

}
