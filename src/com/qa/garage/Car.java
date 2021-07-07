package com.qa.garage;

public class Car extends Vehicles{
	
	public Car(String make, String colour, int year) {
		super(make,colour,year,100,3300,4);
	}
		
		
				
		public void horn() {
			System.out.println("Skrrrrrrr!!");
		};
		
		
		//^^overloading POLYMORPHISM
}