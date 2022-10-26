package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.service.AccountService;

public class ProductUtility {

	public static void main(String[] args) {
		/*Account account=new Account("womens saving account","ACCI987677",10000);
		AccountService accountService=new AccountService();
		accountService.depositCash(account,2000);
		accountService.depositCash(account,0,"suneesh@okhdfc.com");
		accountService.depositCash(account,"CHQNO98756767",100000);*/
		Account account=null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("***********WELCOME TO SBI***********");
		
		char mainChoice;
		int Choice=scanner.nextInt();
		do {
			System.out.println("1.CREATE aCCOUNT 2.MANAGE aCCOUNT 3.DISPLAY aCCOUNT 4.EXIT");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1 :customers=AccountService.createAccount();
				break;
			case 2 : AccountService.displayAccounttDetails(accountList);
				break;
			case 3 : AccountService.manageAccount(accountList);
			case 4 :System.exit(0);
			default : System.out.println("Invalid Choice");
			}
			
			System.out.println("Do you want to continue (Y/N)");
			mainChoice=scanner.next().charAt(0);
		}
		    while(mainChoice =='y');
		
					
		}
    }
}