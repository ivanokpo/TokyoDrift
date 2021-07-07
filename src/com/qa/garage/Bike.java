package com.qa.garage;

public class Bike extends Vehicles{

		
	public Bike(String make, String colour, int year) {
			super(make,colour,year,50,1200,2);
		}
			
			
					
			public void horn() {
				System.out.println("Vrooooom!!");
			};
			
			public int fix() {
				int fuel = 5;
				
				int fix = (getEngine() + getTank() * fuel)/2;
				
				System.out.print("Make: ");
				System.out.println(getMake());
				System.out.print("Engine: ");
				System.out.print(getEngine());
				System.out.println("RPM");
				System.out.print("Tank: ");
				System.out.print(getTank());
				System.out.println("L");
				System.out.print("Fuel Cost: £");
				System.out.println(fuel);
				System.out.println(" ");
				System.out.println("Total:");
				
				return fix;
			//^^overloading POLYMORPHISM
	}

			//^^overloading POLYMORPHISM
	}
	
