package com.satyam.species;

public class Birddemo {

	public static void main(String[] args) {
		
		//create an object for Bird class
		Bird p=new Bird();
		
		//array of bird object
		
		Bird bArray[]=new Bird[100];
		
		//set values to properties
		p.setBirdName("Parrot");
		p.setBirdColor("green");
		p.setSingingStatus(false);
		
		System.out.println("parrot id:"+p.hashCode());
		
		p.walk();
		p.fly();
		Bird k=new Bird();
		
		k.setBirdName("cokoo");
		k.setBirdColor("Black");
		k.setSingingStatus(true);
		
		System.out.println("cokoo id:"+k.hashCode());
		k.fly();
		display(p);
		display(k);

	}
	//defining a static method to display the Bird object details
	public static void display(Bird b)
	{
		System.out.println("Name:"+b.getBirdName());
		System.out.println("Color:"+b.getBirdColor());
		System.out.println("legs:"+b.getLegs());
		System.out.println("wings:"+b.getWings());
	}
	

}
