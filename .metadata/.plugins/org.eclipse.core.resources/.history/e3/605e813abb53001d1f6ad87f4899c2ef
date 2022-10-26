package com.ilp.basicprogrammingassignment;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BasicProgrammingQuestion19 {

	public static void findDifference(LocalDate date1, LocalDate date2) {// to find difference between dates

		Period period = Period.between(date1, date2);
		System.out.print("Difference " + "between two dates is: ");
		System.out.printf("%d years, %d months" + " and %d days ", period.getYears(), period.getMonths(),
				period.getDays());

	}

	public static void main(String[] args) throws Exception {
		System.out.println("\n***** PROGRAM TO ENTER TWO DATES AND PRINT THE DIFFERENCE BETWEEN THEM:******* \n\n");
		LocalDate parseDate1;
		LocalDate parseDate2;
		String date1;
		String date2;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Enter two dates");
		Scanner scanner = new Scanner(System.in);
		date1 = scanner.nextLine();
		date2 = scanner.nextLine();
		parseDate1 = LocalDate.parse(date1, formatter);
		parseDate2 = LocalDate.parse(date2, formatter);
		findDifference(parseDate1, parseDate2);

	}

}
