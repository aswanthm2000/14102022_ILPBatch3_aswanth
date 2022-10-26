package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.Customer;
import com.experion.entity.Product;
import com.experion.entity.Service;

public class BankServices {
public static ArrayList<Service>createService(){
	
	ArrayList<Service>allServiceList=new ArrayList<Service>();
	allServiceList.add(new Service("deposit cash"));
	allServiceList.add(new Service("withdraw cash"));
	return allServiceList;
}

/*public static ArrayList<Service>allaccountList(){
	
	ArrayList<Customer>allAccountList=new ArrayList<Customer>();
	allAccountList.addAll("savings max");
	allAccountList.add("current");
	return allAccountList;
}*/

public static ArrayList<Product>createProducts(ArrayList<Service>allServiceList){
	ArrayList<Product>productList=new ArrayList<Product>();
	productList.add(CreateSavingsMaxAccount(allServiceList));
	return productList;
}
public static Product CreateSavingsMaxAccount(ArrayList<Service>allServiceList){
	ArrayList<Service>savingsServiceList=new ArrayList<Service>();
	for(Service service:allServiceList)
	{
		if((service.getServiceName().compareTo("deposit cash")==0) || (service.getServiceName().compareTo("withdraw cash")==0)){
			savingsServiceList.add(service);
		}
	}
	Product product=new Account("SMA100","Savingsmax account",savingsServiceList,1000);
	return product;
}

public static Product customerDetails(ArrayList<Customer>allAccountList)
{
	ArrayList<Customer>allAccountLists=new ArrayList<Customer>();
	for(Customer customer:allAccountList)
	{
		customer.getCustomerName();
		customer.getCustomerId();
		customer.getAccountList();
		
	}
	Customer product=new Customer("SMA100","Savingsmax account",allAccountLists);
	return product;
}


}
