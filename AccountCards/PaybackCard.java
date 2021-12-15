package com.java.AccountCards;

public class PaybackCard extends Card{
	
	private int pointsEarned;
	private double totalAmount;
	
	public int getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	public PaybackCard(String holdername, String cardnumber, String expirydate, int pointsEarned, double totalAmount) {
		super(holdername, cardnumber, expirydate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
		
	}
	
	public void displayData() {
		System.out.println("Anandhi's PayBack Card Details: ");
		System.out.println("Card Number: " +this.cardnumber);	
		System.out.println("Points Earned: "+this.pointsEarned);
		System.out.println("Total Amount: "+this.totalAmount);
	}
	
	
	
	
}
