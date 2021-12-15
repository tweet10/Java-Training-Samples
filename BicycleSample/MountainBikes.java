package com.java.BicycleSample;

public class MountainBikes extends Bicycle {
	
	private String suspension;

	public MountainBikes(int startspeed, int startcadence, int startgear, String suspensiontype) {
		
		super(startspeed, startcadence, startgear);
		this.suspension = suspensiontype;
	}

	public String getSuspension() {
		return suspension;
	}

	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}
	
	public void printDescription() {
		
		super.printDescription();
		System.out.println("The Mountain has " +this.suspension+ " suspension.");
	}

}
