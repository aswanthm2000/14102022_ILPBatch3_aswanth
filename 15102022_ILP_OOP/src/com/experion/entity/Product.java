package com.experion.entity;

import java.util.Scanner;

public class Product {

	
	private String productCode;
	private String  productName;
	private String productDescription;
	private double productPrice;
	private String openDate;
	private String validityDate;
	private String expiryDate;
	private boolean active;
	
	
	
	
	
	
	
	
	
	
	
	public void inputProductDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter product code");
		productCode=scanner.nextLine();
		System.out.println("Enter product name");
		productName=scanner.nextLine();
		System.out.println("Enter product description");
		productDescription=scanner.nextLine();
		System.out.println("Enter product price");
		productPrice=scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter product opendate");
		openDate=scanner.nextLine();
		System.out.println("Enter product validity date");
		validityDate=scanner.nextLine();
		System.out.println("Enter product expiry date");
		expiryDate=scanner.nextLine();
		System.out.println("Enter product active (true or false)");
		active=scanner.nextBoolean();
		
	}
		public void displayProductDetails() {
			System.out.println("product name"+"		"+"productDescription"+"	"+"productPrice"+"		"+"openDate"+"		"+"validityDate"+"		"+"expiryDate");
			System.out.println(productName + " " + productDescription + " " + productPrice
					+ " " + openDate + " " + expiryDate);

					}
	
	
	
	}
	
	

