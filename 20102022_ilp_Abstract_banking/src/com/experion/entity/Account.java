package com.experion.entity;



public abstract class Account {
	
	private String customerId;
	private String customerName;
	private String accountType;
	private double accountBalance;
	public Account(String customerId, String customerName, String accountType, double accountBalance) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	}