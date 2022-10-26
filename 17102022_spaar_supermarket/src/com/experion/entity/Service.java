package com.experion.entity;

import java.util.Scanner;

public class Service {
	
	
	
	public static Product createProduct()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter product code");
		String productCode=scanner.nextLine();
		System.out.println("Enter product name");
		String productName = scanner.nextLine();
		System.out.println("Enter product description");
		String productDescription = scanner.nextLine();
		System.out.println("Enter product price");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter product opendate");
		String openDate = scanner.nextLine();
		System.out.println("Enter product validity date");
		String validityDate = scanner.nextLine();
		System.out.println("Enter product expiry date");
		String expiryDate = scanner.nextLine();
		System.out.println("Enter product active (true or false)");
		boolean active = scanner.nextBoolean();
		
		Product product=new Product(productCode,productName,productDescription,productPrice,openDate,validityDate,expiryDate,active);
		return product;
	}
		public static void displayProductDetails(Product[] products) {
			for(Product product:products) {
			System.out.println("product name"+"		"+"productDescription"+"	"+"productPrice"+"		"+"openDate"+"		"+"validityDate"+"		"+"expiryDate"+"    "+"active");
			System.out.println(product.getProductName() + " " + product.getProductDescription() + " " + product.getProductPrice()
					+ " " + product.getOpenDate() + " "+"		"+product.getValidityDate() + "		"+product.getExpiryDate()+"   "+product.isActive());
			}
}
}
