package com.java.ExceptionHandling;

import com.java.Inheritance.CurrentAccount;
import com.java.Inheritance.SavingsAccount;

public class AccountMain {

	public static void main(String[] args) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		SavingsAccount savingsAccount = new SavingsAccount(1, 1000, 0.5);
		CurrentAccount currentAccount = new CurrentAccount(2, 2000);

		savingsAccount.deposit(1000);

		savingsAccount.deposit(12000);
		savingsAccount.deposit(1000);
		savingsAccount.deposit(12000);

		currentAccount.withdraw(152000);
		currentAccount.withdraw(23000);
		currentAccount.withdraw(2000);

		currentAccount.transfer(200, currentAccount);

		savingsAccount.addInterest();
		currentAccount.deductFees();
		System.out.println("hi");

		System.out.println("account saving balance =" + savingsAccount.getAccountBalance());
		System.out.println("account current balance=" + currentAccount.getAccountBalance());

	}

}