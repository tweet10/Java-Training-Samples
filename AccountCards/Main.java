package com.java.AccountCards;

import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. PayBack Card");
		System.out.println("2. Membership Card");
		System.out.println("Select the Card: ");
		int num = sc.nextInt();
		Card card = new Card("Anandhi", "12345", "14/01/2020");
		card.displayData();
		PaybackCard paybackcard = new PaybackCard("Anandhi","12345","14/01/2020", 1000, 50000.0);
		MembershipCard membershipcard = new MembershipCard("Anandhi", "12345", "14/01/2020", "5.0");
		switch(num) {
		case 1: paybackcard.displayData(); break; 
		case 2: membershipcard.displayData(); break;
		default: break;
		}
		

	}

}
