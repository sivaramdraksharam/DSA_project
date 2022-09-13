package com.satyam.inheritance;

public class Train implements Transport{

	@Override
	public void bookTicket() {
		System.out.println("booking ticke for Train");
	}

}
