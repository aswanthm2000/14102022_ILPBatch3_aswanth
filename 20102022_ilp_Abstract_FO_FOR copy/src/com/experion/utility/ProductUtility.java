package com.experion.utility;


import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;


public class ProductUtility {

	public static void main(String[] args) {
		/*Account account=new Account("womens saving account","ACCI987677",10000);
		AccountService accountService=new AccountService();
		accountService.depositCash(account,2000);
		accountService.depositCash(account,0,"suneesh@okhdfc.com");
		accountService.depositCash(account,"CHQNO98756767",100000);*/
		Product product=null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.account 2.card 3.loan");
		int Choice=scanner.nextInt();
		if(Choice==1)
		{
			product=new Account("womens saving account","ACC1987677",10000);
			Account account=(Account)product;
			account.checkBalance();
			account.cashWithdrawal();
				}
		else if(Choice==2)
		{
			product=new Card("master card","card1987677",10000);
			Card card=(Card)product;
			card.checkBalance();
			card.cashWithdrawal();
		}
		else if(Choice==3)
		{
			product=new Loan("home loan","Loan1987677",10000);
			Loan loan=(Loan)product;
			loan.checkDueDate();
			loan.loanApproval();
		}
		product.checkProductValidity();
	}
	
}