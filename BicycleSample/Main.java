package com.java.BicycleSample;

public class Main {

	public static void main(String[] args) {
		
		Bicycle bike1 = new Bicycle(20, 30, 4);
		MountainBikes bike2 = new MountainBikes(10, 20, 2, "Dual Suspension");
		RoadBike bike3 = new RoadBike(20, 10, 3, 23);
		
		bike1.printDescription();
		bike2.printDescription();
		bike3.printDescription();
		

	}

}
