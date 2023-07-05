package com.singletonTask.Withdraw;
import com.singletonTask.Account.Account;
public class Withdraw {
	Account account;
	double withdraw;
  public Withdraw(Account account,double withdraw)
  {
	  this.account=account;
	  this.withdraw=withdraw;
	 }
  public void withdraw()
  {
	  if(withdraw>account.accountBalance)
	  {
		  System.out.println("insufficient balance");
	  }
	  account.accountBalance-=withdraw;
	  System.out.println("balance updated");
	  
  }

}


