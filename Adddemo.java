package com.satyam.sivaram;

import java.util.Scanner;
//polymorphism
public class Adddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Float p,q;
		
		System.out.println("Enter first number:");
		String a=sc.nextLine();
		
		System.out.println("Enter second number:");
		String b=sc.nextLine();
		
		Float x=Float.parseFloat(a);
		Float y=Float.parseFloat(b);
		
		if(x.floatValue()==0)
		{
			System.out.println("o");
		}
		Number result=add(x,y);
		
		System.out.println(result);
		
		
	}
	
	
	public static int add(int x, int y)
	{
		return x+y;
	}
	
	public static float add(float x, float y)
	{
		return x+y;
	}

}
