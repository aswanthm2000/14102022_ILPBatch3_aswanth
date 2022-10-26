package com.ilpexperion.objectclassbasics;

public class Employee {

	String employeeName="suneesh thambi";
	int employeeAge=36;
	char employeeGender='M';
	double employeeCgpa= 7.5;
	
	public void displayEmployeeDetails() {
		System.out.println("*******welcome to ilp program*****");
		System.out.println("Name"+"		    "+"Age"+"		"+"Gender"+"		"+"CGPA");
		System.out.println(employeeName +"			"+employeeAge+"		"+employeeGender+"  	"+employeeCgpa);
	}
}