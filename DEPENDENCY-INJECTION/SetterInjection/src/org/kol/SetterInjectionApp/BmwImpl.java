package org.kol.SetterInjectionApp;

import java.util.List;

public class BmwImpl implements ICar{
	
	
	private int car_number;
	private String color;
	private List<String> wheels;
	private Engine engine;
	public int getCar_number() {
		return car_number;
	}
	public void setCar_number(int car_number) {
		this.car_number = car_number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List<String> getWheels() {
		return wheels;
	}
	public void setWheels(List<String> wheels) {
		this.wheels = wheels;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	@Override
	public void drive() {
		
		System.out.println("BMW SPECIFICATIONS");
		System.out.println("Registration Number:"+getCar_number());
		System.out.println("Car Color:"+getColor());
		System.out.println("Wheels: "+getWheels());
		System.out.println("Engine"+getEngine());
		System.out.println("Driving BMW Happily....");
	}
	
	

}
