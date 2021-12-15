package com.java.Inheritance;

public class PriveledgedAccount extends Account{
	
	public void withdraw(double amount) {
		super.setAccountBalance(super.getAccountBalance() - amount);
	}

}

