package com.experion.entity;



public class Account extends Product implements CardAccountService{

	private String accountNumber;
	private double accountBalance;
	
	
	public Account(String productName, String accountNumber, double accountBalance) {
		super(productName);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override//annotation
	public void checkProductValidity() {
		System.out.println("validity check of account class called");
		
	}
	@Override
	public void checkBalance() {
		System.out.println("account balance is checked");
		
	}
	@Override
	public void cashWithdrawal() {
		System.out.println("balance is withdrawn");
	}
	
	
}