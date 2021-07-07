package com.qa.garage;

public class Bike extends Vehicles{

		
	public Bike(String make, String colour, int year) {
			super(make,colour,year,50,1200,2);
		}
			
			
					
			public void horn() {
				System.out.println("Vrooooom!!");
			};
			
			

			//^^overloading POLYMORPHISM
	}
	
