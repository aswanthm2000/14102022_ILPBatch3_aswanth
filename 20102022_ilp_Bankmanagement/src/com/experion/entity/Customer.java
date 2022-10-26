package com.experion.entity;

import java.util.ArrayList;

public class Customer {

private String customerName;
private String customerId;
ArrayList<Account>accountList=new ArrayList<Account>();
public Customer(String customerName, String customerId, ArrayList<Account> accountList) {

	this.customerName = customerName;
	this.customerId = customerId;
	this.accountList = accountList;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public ArrayList<Account> getAccountList() {
	return accountList;
}
public void setAccountList(ArrayList<Account> accountList) {
	this.accountList = accountList;
}
}
