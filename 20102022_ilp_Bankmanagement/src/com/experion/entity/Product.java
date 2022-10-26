package com.experion.entity;

import java.util.ArrayList;

public class Product {

	private	String productCode;
	private	String productName;
	ArrayList<Service>ServiceList=new ArrayList<Service>();
		public Product(String productCode, String productName, ArrayList<Service> serviceList) {
		
			this.productCode = productCode;
			this.productName = productName;
			ServiceList = serviceList;
		}
		public String getProductCode() {
			return productCode;
		}
		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public ArrayList<Service> getServiceList() {
			return ServiceList;
		}
		public void setServiceList(ArrayList<Service> serviceList) {
			ServiceList = serviceList;
		}
		
	}


