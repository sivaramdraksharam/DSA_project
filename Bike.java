package com.satyam.inheritance;

public class Bike extends Twowheeler implements Comparable{

	private String Brand;
	private String bikeNumber;
	
	@Override
	public void balance() {
		System.out.println("Just tilt the handle...");
		System.out.println("While taking turnings, just slow accelerator");
		
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getBikeNumber() {
		return bikeNumber;
	}

	public void setBikeNumber(String bikeNumber) {
		this.bikeNumber = bikeNumber;
	}

	@Override
	public int compareTo(Object o) {
		
		Bike secondBike=(Bike)o;
		if(this.getBrand().equals(secondBike.getBrand()) )
		{
			System.out.println("Both belongs to the Brand:"+this.getBrand());
		}
		
		return 0;
	}

}
