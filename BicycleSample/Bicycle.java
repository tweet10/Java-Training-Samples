package com.java.BicycleSample;

public class Bicycle {
	
	private int speed;
	private int cadence;
	private int gear;

	public Bicycle(int startspeed, int startcadence, int startgear) {
		speed = startspeed;
		cadence = startcadence;
		gear = startgear;
	}
	
	public void setcadence(int newcadence) {
		cadence = newcadence;
	}
	
	public int getcadence() {
		return cadence;
	}
	
	public void setspeed(int newspeed) {
		speed = newspeed;
	}
	
	public int getspeed() {
		return speed;
	}
	
	public void setgear(int newgear) {
		gear = newgear;
	}
	
	public int getgear() {
		return gear;
	}
	
	public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
	
	public void speedUp(int increment)
    {
        speed += increment;
    }
	
	public void printDescription() {
		System.out.println("Bike is in Gear " +gear+ " with Cadence of " +cadence+ " and Travelling at a Speed of " +speed+ ".");
	}
	
	
}
