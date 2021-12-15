package com.java.Inheritance;

public class SavingsAccount extends Account {
	
	private double interestRate;
	
	public SavingsAccount(int accountNumber, double initialBalance, double rate) {
		super(accountNumber, initialBalance);
		interestRate = rate;
	}
	
	public void addInterest() {
		double insterest = getAccountBalance() * interestRate/100;
		deposit(insterest);
	}
	
}

