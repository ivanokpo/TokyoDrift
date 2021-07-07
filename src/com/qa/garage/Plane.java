package com.qa.garage;

public class Plane extends Vehicles{

		
	public Plane(String make, String colour, int year) {
			super(make,colour,year,300,9000,6);
		}
			
			
					
			public void horn() {
				System.out.println("Houston... we have a problem");
			};
			
			public int fix() {
				int fuel = 200;
				
				int fix = 4 * (getEngine()) + getTank() * fuel;
				
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
				System.out.print(" ");
				System.out.print("Total:");
				return fix;
			//^^overloading POLYMORPHISM
	}

			//^^overloading POLYMORPHISM
	}
	