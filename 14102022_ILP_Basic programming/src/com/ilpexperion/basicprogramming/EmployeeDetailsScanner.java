package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class EmployeeDetailsScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner=new Scanner(System.in);
	String trainingName="*******Welcome to ilp program*******";
	String employeeName;
	int employeeAge;
	char employeeGender;
	double employeeCgpa;
	
	System.out.println("enter employee name-");
	employeeName=scanner.nextLine();
	System.out.println("enter employee age-");
	employeeAge=scanner.nextInt();
	System.out.println("enter employeeGender-");
	employeeGender=scanner.next().charAt(0);
	System.out.println("enter employeeCgpa-");
	employeeCgpa=scanner.nextDouble();
	
	System.out.println(trainingName);
	System.out.println("Name"+"		    "+"Age"+"		"+"Gender"+"		"+"CGPA");
	System.out.println(employeeName +"			"+employeeGender+"  	"+employeeCgpa);
	}

}