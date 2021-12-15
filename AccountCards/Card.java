package com.java.AccountCards;



public class Card {
	
	protected String holdername;
	protected String cardnumber;
	protected String expirydate;
	
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	
	public Card(String holdername, String cardnumber, String expirydate) {
		this.holdername = holdername;
		this.cardnumber = cardnumber;
		this.expirydate = expirydate;
	}
	
	public void displayData() {
		

		System.out.println("Card Details:");
		System.out.println(this.holdername+ " | " +this.cardnumber+ " | " +this.expirydate);
		
		
	}

}
