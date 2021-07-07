package com.qa.garage;

public class Car extends Vehicles{
	
	public Car(String make, String colour, int year) {
		super(make,colour,year,100,3300,4);
	}
		
		
				
		public void horn() {
			System.out.println("Skrrrrrrr!!");
		};
		
		public int fix() {
			int fuel = 12;
			
			int fix = getEngine() + getTank() * fuel;
			
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
}