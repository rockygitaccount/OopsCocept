package com.polumorphism;

public class PlatinumAccount extends GoldAccount {
@Override
	public void chqBooks() {
		System.out.println("Unlimited");
	}
@Override
public void rateOfInterest() {
	System.out.println("6% PA");
}
public static void main(String[] args) {
	GoldAccount g = new GoldAccount();
	g.onlineBanking();
	g.rateOfInterest();
	g.chqBooks();
	
	PlatinumAccount p = new PlatinumAccount();
	p.onlineBanking();
	p.rateOfInterest();
	p.chqBooks();
}
}
