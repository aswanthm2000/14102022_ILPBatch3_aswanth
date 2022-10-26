package com.experion.utility;



import java.util.ArrayList;



import com.experion.entity.Product;
import com.experion.entity.Service;
import com.experion.service.BankServices;



public class BankUtility {



   public static void main(String[] args)
    {
        
        
            
            ArrayList<Product> productList = new ArrayList<Product>();
            ArrayList<Service> allServicesList = new ArrayList<Service>();
            allServicesList=BankServices.createService();
            productList = BankServices.createProducts(allServicesList);
            
            
            for(Product product : productList)
            {
                System.out.println(product.getProductName());
                for(Service service : product.getServiceList())
                {
                    System.out.println(service.getServiceName());
     
                }
           }
  }
}