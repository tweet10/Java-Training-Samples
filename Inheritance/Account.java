package com.java.Inheritance;

public class Account {
	
	private static int LastAssignedNumber = 0;
	
	private int accountNumber;
	private double accountBalance;
	
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public Account(int accountNumber, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public Account() {
		LastAssignedNumber++;
		accountNumber = LastAssignedNumber;
	}
	
	public Account(double accountBalance) {
		LastAssignedNumber++;
		accountNumber = LastAssignedNumber;
		this.accountBalance = accountBalance;
	}
	
	public void showdata() {
		System.out.println("Account Number: " +accountBalance);
		System.out.println("Account Balance: " +accountBalance);
	}
	
	public void deposit(double d) {
		System.out.println("Account Deposit called");
		if(d < 0) {
			System.out.println("Invalid");
		} else
			accountBalance = accountBalance + d;
	}
	
	public void withdraw(double d) {
		if(accountBalance < d) {
			System.out.println("Invalid");
		} else
			accountBalance = accountBalance - d;
	}
	
	public void transfer(double amount, Account other) {
		withdraw(amount);
		other.deposit(amount);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if(!(obj instanceof Account)) {
			return false;
		}
		
		Account other = (Account) obj;
		if(Double.doubleToLongBits(accountBalance) != Double.doubleToLongBits(accountBalance)) {
			return false;
		}
		
		if(accountNumber != other.accountNumber) {
			return false;
		}
		return true;
	}
	
	public String toString() {
		return "Account [acountNumber=" + accountNumber +" , accountBalance=" + accountBalance + "]";
	}


}
