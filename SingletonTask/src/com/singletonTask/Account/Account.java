package com.singletonTask.Account;

public class Account {
	
	public double accountBalance;
	private Account(double accountBalance)
	{
		this.accountBalance=accountBalance;
	}
	public static Account getA()
	{
		Account account=new Account(10000);
		return account;
	}

}
