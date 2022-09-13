package com.satyam.species;

public class Bird {
	
	public static int legs=2;
	public static int wings=2;
	public String birdColor;
	public String birdName;
	private boolean singingStatus;
	
	public Bird() {
		super();
	}

	public void walk()
	{
		System.out.println(birdColor+" "+birdName+" waling with "+legs+" legs.");
	}
	
	public void fly()
	{
		System.out.println(birdColor+" "+birdName+" flying with "+wings+" wings.");
	}
	
	
	public int getLegs() {
		return legs;
	}
	public int getWings() {
		return wings;
	}
	public String getBirdColor() {
		return birdColor;
	}
	public String getBirdName() {
		return birdName;
	}
	public boolean isSingingStatus() {
		return singingStatus;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	public void setBirdColor(String birdColor) {
		this.birdColor = birdColor;
	}
	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}
	public void setSingingStatus(boolean singingStatus) {
		this.singingStatus = singingStatus;
	}
	
	
	
	

}
