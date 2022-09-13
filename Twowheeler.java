package com.satyam.inheritance;

//abstract class - we can not create object for abstract class
public abstract class Twowheeler {
	
	private int wheels;
	
	//abstract method
	public abstract void balance() ;
	
	//concrete menthod
	public void showDetails()
	{
		System.out.println("The number of wheels: "+wheels);
	}

}
