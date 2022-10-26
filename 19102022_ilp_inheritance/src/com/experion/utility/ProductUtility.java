package com.experion.utility;
import com.experion.service.*;
import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Product;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
			char mainChoice;
			Scanner scanner=new Scanner(System.in);
			ArrayList<Product>productList=new ArrayList<Product>();
			do
			{
			System.out.println("1.add card product  2.add account Product 3.Buy Product");
			int choice=scanner.nextInt();
			switch(choice) 
			{
			case 1 : productList.add(Service.createProduct("cards"));
				break;
			case 2 : productList.add(Service.createProduct("accounts"));
				break;
			case 3 : Service.displayProductDeatils(productList);
				break;
			default:System.out.println("invalid choice");
			}
			System.out.println("do you want to continue(y/n)");
			mainChoice=scanner.next().charAt(0);
			}	
	    	while(mainChoice=='y');
			
	}

}
