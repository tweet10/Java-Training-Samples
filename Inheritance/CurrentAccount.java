package com.java.Inheritance;

public class CurrentAccount extends Account {
	
	private static final int FRFEE_TRANSACTIONS = 3;
	private static final double TRANSACTIONS_FEE = 2.0;
	
	private double transactionsCount;
	public CurrentAccount(int accountNumber,double initialBalance) {
		super(accountNumber, initialBalance);
		transactionsCount = 0;
	}
	
	public void deposit(double amount) {
		System.out.println("Current Account Deposit called");
		transactionsCount++;
		super.deposit(amount);
	}

	public void withdraw(double amount) {
		transactionsCount++;
		super.withdraw(amount);
	}
	
	public void deductFees() {
		if(transactionsCount > FRFEE_TRANSACTIONS) {
			double fees = TRANSACTIONS_FEE * (transactionsCount - FRFEE_TRANSACTIONS);
			super.withdraw(fees);
		}
		
		transactionsCount = 0;
	}
	
	
}
