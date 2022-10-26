package com.experion.service;

import java.util.ArrayList;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Customer;
import com.experion.entity.Product;

public class AccountService {
	
	public static void createAccount(ArrayList<Customer>customers) {
	
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter customer id");
	String customerId=scanner.nextLine();
	System.out.println("enter customer Name");
	String customerName=scanner.nextLine();
	
	
	if (customerId==null)
	{
		System.out.println("customer id invalid...create new account");
		}
	else
	{
		System.out.println("customer active..continue");
	}
	}

	public static ArrayList<Account> displayAccountDetails(ArrayList<Account>accountList)
	
	{
		System.out.println("customer id         customername      accounttype     balance");
		for(Account account:accountList) {
		if (accountList!=null);
		System.out.println(account.getCustomerId()+"      "+account.getCustomerName()+"    "+account.getAccountType()+"    "+account.getAccountBalance());
		}
		return accountList;
		
	}
	public static void depositCash() {
    int amount= 0;
    
    int userInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited: ");
        amt = scanner.nextInt();
        if(amt<=0)
        {
            invalid_transaction depositnegativeError = new invalid_transaction("Invalid Deposit Amount");
            System.out.println(depositnegativeError.getMessage());
            userInput();
           
        }else{   
            return amt;
        }
        return amt;
        
    }
    
  }
}