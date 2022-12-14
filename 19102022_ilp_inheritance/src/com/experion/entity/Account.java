package com.experion.entity;

import java.util.ArrayList;

public class Account extends Product {

	private String accountType;
	private ArrayList<BankServices> bankservices;


	public Account(String productCode, String productName, String productType, String accountType,
			ArrayList<BankServices> bankservices) {
		super(productCode, productName, productType);
		this.accountType = accountType;
		this.bankservices = bankservices;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public ArrayList<BankServices> getBankservices() {
		return bankservices;
	}

	public void setBankservices(ArrayList<BankServices> bankservices) {
		this.bankservices = bankservices;
	}

	

	
	
}
