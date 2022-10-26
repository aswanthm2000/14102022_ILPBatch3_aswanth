package com.experion.basicprogramming;

import java.util.Scanner;

public class VowelValidation {

	public static void main(String[] args) {
		
		
		char a;
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a letter");
		a=scanner.next().charAt(0);
		
		
		switch(a)
		{
		case 'a':System.out.println("a is vowel");
				break;
		case 'e':System.out.println("e is vowel");
				break;	
		case 'i':System.out.println("i is vowel");
				break;	
		case 'o':System.out.println("o is vowel");
				break;	
		case 'u':System.out.println("u is vowel");
				break;
		
		default:System.out.println("number is not vowel");
				break;
			
	}
	}


 }