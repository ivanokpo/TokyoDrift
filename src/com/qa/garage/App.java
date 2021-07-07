package com.qa.garage;



public class App {
	
	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car car1 = new Car("Tesla", "Red", 2012);
		Bike bike1 = new Bike("Sizuki", "Green", 2004);
		Plane plane1 = new Plane("Concord", "White", 1999);
		
		garage.addVehicle(car1);
		garage.addVehicle(bike1);
		garage.addVehicle(plane1);
		garage.listVehicles();
		
		
		
	}
	
	
}