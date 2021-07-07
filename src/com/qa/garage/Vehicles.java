package com.qa.garage;

import java.util.ArrayList;

public abstract class Vehicles{
	
	private String make;
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	private int year;
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int Year) {
		this.year = year;
	}
	
	private String colour;
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	private int engine;
	
	public int getEngine() {
		return engine;
	}
	
	public void setEngine(int engine) {
		this.engine = engine;
	}
	
	
	private int tank;
	
	public int getTank() {
		return tank;
	}
	
	public void setTank(int tank) {
		this.tank = tank;
	}
	
	
	
	private int wheels;
	
	public int getWheels() {
		return wheels;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
		
	public Vehicles( String make , String colour, int year, int engine, int tank, int wheels) {
		super();
		this.make = make;
		this.colour = colour;
		this.year = year;
		this.engine = engine;
		this.tank = tank;
		this.wheels = wheels;
	}
	
	public void print() {
		System.out.println(" ");
		System.out.print("Make: ");
		System.out.println(getMake());
		System.out.print("Colour: ");
		System.out.println(getColour());
		System.out.print("Year: ");
		System.out.println(getYear());
		
		}
	
	public int fix() {
		int fuel = 9;
		
		int fix = engine + tank * fuel;
		
		return fix;
		
	}
	
	public abstract void horn();
	
	
	
	

	
	
}