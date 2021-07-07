package com.qa.garage;

import java.util.ArrayList;



public class Garage {

	
		ArrayList<Vehicles> vehicles =  new ArrayList<>();
		ArrayList<Vehicles> garbage = new ArrayList<>();
		
		
		public void addVehicle(Vehicles vehicle ) {
			this.vehicles.add(vehicle);
			}
		
		
		
		
		public int fixSpecVec(String make) {
			int bill = 0;
			for (int i = 0 ; i < vehicles.size() ; i++) {
				
			if(vehicles.get(i).getMake() == make) {
				bill += vehicles.get(i).fix();
			}
				
			}
			return bill;
		}
		
		public int fixVehicle() {
			int bill = 0;
			for (int i = 0 ; i < vehicles.size() ; i++) {
				bill += vehicles.get(i).fix();
				}
				return bill;
		}
		
		
			
		
		public void listVehicles() {
			for (int i = 0; i < vehicles.size() ; i++) {
				vehicles.get(i).print();
			}
		}
		
		public Vehicles findVehicle(String make) {
			for (Vehicles vehicle : this.vehicles) {
				if (vehicle.getMake() == make) {
					
					return vehicle;
				}
			}
			
		
			return null;
				
				
			
		}
		
		
		public void removeVehicle(Vehicles vehicle) {
			this.vehicles.remove(vehicle);
		}
		
		public void rmVehicleType(String type) {
			for (int i = 0 ; i < vehicles.size(); i++) {
				
				if (vehicles.get(i).getClass().getSimpleName().equals(type)) {
					
					this.vehicles.remove(i);
				}
			}
		
		
		}
		
		public void emptyGarage() {
			vehicles.clear();
		}
}
		