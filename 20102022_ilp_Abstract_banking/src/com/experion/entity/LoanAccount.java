package com.experion.entity;

public class LoanAccount {
	private String accountBalance;

	public LoanAccount(String accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

}
