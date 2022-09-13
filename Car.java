package com.satyam.automobiles;
//creating car class
public class Car {
	//properties
	private static int wheels;
	private int seats;
	private String carModel;
	private String carName;
	
	public boolean movingStatus;
	
	
	//constructor is used to initialize common values to the properties
	public Car() {
		wheels=4;
		seats=4;
	}
	
	public void start()
	{
		System.out.println("car starts");
		movingStatus=true;
	}
	
	public void stop()
	{
		System.out.println("car stops!");
		movingStatus=false;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public String getCarModel() {
		return carModel;
	}

	public String getCarName() {
		return carName;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	
	
	

}
