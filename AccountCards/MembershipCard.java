package com.java.AccountCards;

public class MembershipCard extends Card {

	private String rating;
	
	
	
	public String getRating() {
		return rating;
	}



	public void setRating(String rating) {
		this.rating = rating;
	}



	public MembershipCard(String holdername, String cardnumber, String expirydate, String rating) {
		super(holdername, cardnumber, expirydate);
		this.rating = rating;
		
	}

	public void displayData() {
		System.out.println("MemberShip Card "+this.rating);
	}
	
	

}
