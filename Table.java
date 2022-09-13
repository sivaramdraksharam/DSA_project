package com.satyam.sivaram;

public class Table extends Furniture {

	@Override
	public void areaOfPlane(int length, int width) {
		
		this.setLength(length);
		this.setWidth(width);
		
		System.out.println("Area of plane is:"+this.getLength()*this.getWidth()+"sq.cm");
		
	}

}
