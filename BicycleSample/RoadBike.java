package com.java.BicycleSample;

public class RoadBike extends Bicycle {
	
	private int tires;

	public RoadBike(int startspeed, int startcadence, int startgear, int tirelength) {
		
		super(startspeed, startcadence, startgear);
		this.tires = tirelength;
	}

	public int getTires() {
		return tires;
	}

	public void setTires(int tires) {
		this.tires = tires;
	}
	
	public void printDescription() {
		
		super.printDescription();
		System.out.println("The Roadbike has " +this.tires+ " MM Tires.");
	}

}
