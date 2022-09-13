package com.satyam.sivaram;

public class Furnituredemo {

	public static void main(String[] args) {
		
		Table t=new Table();
		
		//t.areaOfPlane(4, 7);
		
		Furniture f=new Table();
		
		Furniture f1=new Chair();
		
		//f.areaOfPlane(5, 7);
		
		int length[]= {4,5};
		int width[]= {7,7};
		
		Furniture farray[]=new Furniture[2];
		
		farray[0]=t;
		farray[1]=f;
		
		int i=0;
		for(Furniture furn : farray)
		{
			
			furn.areaOfPlane(length[i], width[i]);
			i++;
			System.out.println(furn.getLength());
			System.out.println(furn.getWidth());
			
		}
		

	}

}
