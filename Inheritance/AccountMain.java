package com.java.Inheritance;

public class AccountMain {

	public static void main(String[] args) {
		
		SavingsAccount savingAcc = new SavingsAccount(1, 1000, 0.5);
		CurrentAccount currentAcc = new CurrentAccount(2, 2000);
		
		savingAcc.deposit(10000);
		
		savingAcc.transfer(2000, currentAcc);
		currentAcc.withdraw(1500);
		currentAcc.withdraw(80);
		
		savingAcc.transfer(1000, currentAcc);
		currentAcc.withdraw(400);
		
		savingAcc.addInterest();
		currentAcc.deductFees();
		
		System.out.println("Account1 Savings Balance = " + savingAcc.getAccountBalance());
		System.out.println("Account2 Checking Balance = " + currentAcc.getAccountBalance());

	}

}

	