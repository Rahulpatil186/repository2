package com.singletonTask.CheckBalance;
import com.singletonTask.Account.*;
public class CheckBalance {
	Account account;
	public CheckBalance(Account account)
	{
		this.account=account;
	}
	public void checkbalance()
	{
		System.out.println("Account balance is = "+account.accountBalance);
	}

}
