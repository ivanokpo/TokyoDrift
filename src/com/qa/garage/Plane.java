package com.qa.garage;

public class Plane extends Vehicles{

		
	public Plane(String make, String colour, int year) {
			super(make,colour,year,300,9000,6);
		}
			
			
					
			public void horn() {
				System.out.println("Houston... we have a problem");
			};
			
			

			//^^overloading POLYMORPHISM
	}
	