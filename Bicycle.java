package com.satyam.inheritance;

public class Bicycle extends Twowheeler{

	private int Brand;

	@Override
	public void balance() {
		System.out.println("We can take wide angle of turning the handle");
		
	}

	public int getBrand() {
		return Brand;
	}

	public void setBrand(int brand) {
		Brand = brand;
	}
	
	
}
