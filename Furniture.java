package com.satyam.sivaram;

public abstract class Furniture {

	private int planes;
	private int length;
	private int width;
	
	public abstract void areaOfPlane(int length, int width);

	public int getPlanes() {
		return planes;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setPlanes(int planes) {
		this.planes = planes;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void showFurniture()
	{
		System.out.println("Furniture show");
	}
	
	
}
