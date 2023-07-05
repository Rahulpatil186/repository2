package com.singletonTask.Main;
import com.singletonTask.Account.Account;
import com.singletonTask.CheckBalance.*;
import com.singletonTask.Deposit.*;
import com.singletonTask.Withdraw.*;
import java.util.Scanner;
public class SingletonTask {
	Scanner sc=new Scanner(System.in);
	static boolean loop=true;
   public void Operations()
   {
	 System.out.println("\1)checkbalance\n2)deposit\n3)withdraw\n4)exit");
	 int choice=sc.nextInt();
	 switch(choice)
	 {
	 case 1:
		  Account checkAccount=Account.getA();
		 CheckBalance checkbalance=new CheckBalance(checkAccount);
		 checkbalance.checkbalance();
		 break;
	 case 2:
		 Account accountDeposit=Account.getA();
		 Deposit deposit=new Deposit(accountDeposit,1000);
		 deposit.deposit();
		 break;
	 case 3:
		 Account accountwithdraw=Account.getA();
		 Withdraw withdraw=new Withdraw(accountwithdraw,2000);
		 withdraw.withdraw();
		 break;
	 case 4:
		 System.out.println("Thank you");
		 loop=false;
		 break;
    default :
    	System.out.println("invalid choice");
    	break;
		 
	 }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonTask singleton=new SingletonTask();
		while(loop) {
			singleton.Operations();
		}

	}

}
