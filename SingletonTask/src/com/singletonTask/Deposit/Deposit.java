package com.singletonTask.Deposit;
import com.singletonTask.Account.*;
public class Deposit {
	Account account;
	double deposit;
  public Deposit(Account account,double deposit)
  {
	  this.account=account;
	  this.deposit=deposit;
	 }
  public void deposit()
  {
	  account.accountBalance+=deposit;
	  System.out.println("Ammount "+deposit+" added to your account");
  }

}
