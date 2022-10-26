package com.experion.entity;

import java.util.Scanner;

public class ProductUtility {

	

	public static void main(String[] args) {
		

		char mainChoice;
		int index=0;
		Scanner scanner=new Scanner(System.in);
		Product productList[]=new Product[3];
		do 
		{
			System.out.println("1.create product 2.display product");
			int choice=scanner.nextInt();
			switch(choice)
			{  
				case 1:productList[index]=Service.createProduct();
					index++;
					break;
				case 2:Service.displayProductDetails(productList);
				
			}
			System.out.println("do you want to communicate(y/n)");
			mainChoice=scanner.next().charAt(0);
			
		}
		while(mainChoice=='Y');
		
		
			
		
	}
}
		/*String productCode;
		Scanner scanner=new Scanner(System.in);
		Product product=new Product();
		System.out.println("enter the product code");
		productCode=scanner.nextLine();
		product.setProductCode(productCode);
		System.out.println("the product code is " + product.getProductCode());
		
		Product productTwo=new Product();
		System.out.println("enter the second product code");
		productCode=scanner.nextLine();
		productTwo.setProductCode(productCode);
		System.out.println("the product code is " + productTwo.getProductCode());
		
		
		
		String productName;
		System.out.println("Enter product name");
		productName=scanner.nextLine();
		product.setProductName(productName);
		System.out.println("the product code is " + product.getProductName());
		
		System.out.println("Enter second product name");
		productName=scanner.nextLine();
		productTwo.setProductName(productName);
		System.out.println("the second product code is " + productTwo.getProductName());
	
	
		String productDescription;
		System.out.println("Enter product description");
		productDescription=scanner.nextLine();
		product.setProductDescription(productDescription);
		System.out.println("the second product code is " + productTwo.getProductName());
	}*/


	
