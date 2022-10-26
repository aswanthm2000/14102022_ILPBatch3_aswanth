package com.experion.utility;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) throws ParseException {
		
	
		
		char mainChoice;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> productList=new ArrayList<Product>();
		//Product productList[]=new Product[3];
		
		do {
			System.out.println("1.Create Product 2.Display Product 3.Buy Product");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1 : productList.add(Service.createProduct());
				break;
			case 2 : Service.displayProductDetails(productList);
				break;
			case 3 : Service.buyProduct(productList);
			}
			
			System.out.println("Do you want to continue (Y/N)");
			mainChoice=scanner.next().charAt(0);
		}while(mainChoice=='Y');
		
	}

}
