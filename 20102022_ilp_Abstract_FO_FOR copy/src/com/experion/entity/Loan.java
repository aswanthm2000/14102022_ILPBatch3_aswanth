package com.experion.entity;



public class Loan extends Product implements LoanService {

	private String loanNumber;
	private double loanAmount;
	public Loan(String productName, String loanNumber, double loanAmount) {
		super(productName);
		this.loanNumber = loanNumber;
		this.loanAmount = loanAmount;
	}
	public String getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public void checkProductValidity() {
		System.out.println("validity check of loan class called");
		
	}
	@Override
	public void checkDueDate() {
		System.out.println("checking due date started");
		
	}
	@Override
	public void loanApproval() {
		System.out.println("loan approval is initiated");
		
	}
	
}