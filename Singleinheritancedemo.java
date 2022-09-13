package com.satyam.inheritance;

public class Singleinheritancedemo {

	public static void main(String[] args) {
		
		//super class reference is instantiated with subclass instance
		Bike mybike=new Bike();
		Bike yourbike=new Bike();
		
		mybike.setBrand("Hero");
		yourbike.setBrand("Hero");
		
		mybike.setBikeNumber("AP241241");
		yourbike.setBikeNumber("AP241241");
		
		mybike.compareTo(yourbike);
		
		/*
		 * Twowheeler yourbicycle=new Bicycle();
		 * 
		 * mybike.balance(); yourbicycle.balance();
		 */
		

	}

}
