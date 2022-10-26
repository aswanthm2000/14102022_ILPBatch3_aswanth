package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.CurrentAccount;
import com.experion.entity.Customer;
import com.experion.entity.SavingsMaxAccount;

public class AccountService {

	Scanner scanner = new Scanner(System.in);
	
	public ArrayList<Customer> createAccount(ArrayList<Customer> customers) // to create account
	{
		System.out.println("Enter Customer Id");
		String customerIdEnter = scanner.nextLine();
		String findCustomerId = checkCustomer(customerIdEnter,customers);
		if (findCustomerId == null) {
			System.out.println("Customer Id not available!! Create new Account");
			customers=createNewCustomerAccount(customers);
		}
		else {
			System.out.println("Customer available!! Creating Account using existing details");
			customers=createExistingCustomerAccount(findCustomerId,customers);
		}
		return customers;
	}

	

	public String checkCustomer(String customerIdEnter, ArrayList<Customer> customers) // To search existing customer
	{
		String findCustomerId = null;
		for (Customer customer : customers) {
			if (customer.getCustomerId().equalsIgnoreCase(customerIdEnter)) {
				findCustomerId = customer.getCustomerId();
			}
		}
		return findCustomerId;
	}

	public ArrayList<Customer> createNewCustomerAccount(ArrayList<Customer> customers) { //for creating account for new customer
		Account account = null;
		System.out.println("Products Available");
		System.out.println("1.Savings Max Account\n2.Current Account\n3.Loan Account");
		System.out.println("Enter your choice");
		int accountChoice = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Customer Code :");
		String customerCode = scanner.nextLine();
		System.out.println("Enter the Customer Name :");
		String customerName = scanner.nextLine();
		switch (accountChoice) {
		case 1:
			account = new SavingsMaxAccount(customerCode, customerName, "SavingsMaxAccount", 0);
			System.out.println("Savings Max Account is created for " + customerName + "...Account is Active !!");
			break;
		case 2:
			account = new CurrentAccount(customerCode, customerName, "CurrentAccount", 0);
			System.out.println("Current Account is created for " + customerName + "...Account is Active !!");
			break;
		case 3:
			account = new CurrentAccount(customerCode, customerName, "LoanAccount", 0);
			System.out.println("Loan Account is created for " + customerName + "...Account is Active !!");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(account);
		Customer customer = new Customer(customerCode, customerName, accounts);
		customers.add(customer);
		return customers;
	}
	
	public ArrayList<Customer> createExistingCustomerAccount(String findCustomerId,ArrayList<Customer> customers) { // for creating account for existing customer
		// TODO Auto-generated method stub
		Account account = null;
		String customerCode=null;
		String customerName=null;
		System.out.println("Products Available");
		System.out.println("1.Savings Max Account\n 2.Current Account\n3.Loan Account");
		System.out.println("Enter your choice");
		int accountChoice = scanner.nextInt();
		for (Customer customer : customers) {
			if (customer.getCustomerId() == findCustomerId) {
				customerCode=customer.getCustomerId();
				customerName = customer.getCustomerName();
			}
		}
		switch (accountChoice) {
		case 1:
			account = new SavingsMaxAccount(customerCode, customerName, "SavingsMaxAccount", 0);
			System.out.println("Savings Max Account is created for " + customerName + "Account is Active !!");
			break;
		case 2:
			account = new CurrentAccount(customerCode, customerName, "CurrentAccount", 0);
			System.out.println("Savings Max Account is created for " + customerName + "Account is Active !!");
			break;
		case 3:
			account = new CurrentAccount(customerCode, customerName, "LoanAccount", 0);
			System.out.println("Savings Max Account is created for " + customerName + "Account is Active !!");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		for (Customer customer : customers) {
			if (customer.getCustomerId() == findCustomerId) {
				ArrayList<Account> accounts = customer.getAccount();
				accounts.add(account);
			}
		}
		
		return customers;
	}

	public void manageAccount(ArrayList<Customer> customers) { //to manage accounts
		// TODO Auto-generated method stub
		
		System.out.println("Enter Customer Id");
		String customerCodeEnter = scanner.nextLine();
		String customerName=null;
		ArrayList<Account> accounts =null;
		boolean findCustomer = false;
		String accountSelection = null;
		for (Customer customer : customers) {
			if (customer.getCustomerId() == customerCodeEnter) {
				findCustomer = true;
				customerName = customer.getCustomerName();
				accounts=customer.getAccount();
			}

		}
		if(findCustomer==false)
			System.out.println("Invalid Customer Id");
		else {
			System.out.println(customerName+"has got the following accounts");
			for(Account account : accounts) {
				System.out.println(account);
			}
			System.out.println("Enter the account for service : ");
			accountSelection = scanner.nextLine();
		}
	}	}
