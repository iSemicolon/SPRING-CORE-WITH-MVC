package org.kol.ConstructorApp;

import java.util.List;

public class BmwImpl implements ICar{

	private int car_number;
	private String color;
	private List<String> wheels;
	private Engine engine;
	
	public BmwImpl(int car_number, String color, List<String> wheels ,  Engine engine ) {
		
		super();
		
		System.out.println("BMW object Created");
		this.car_number=car_number;
		this.color=color;
		this.wheels=wheels;
		this.engine=engine;

	}

	@Override
	public void drive() {
		System.out.println("BMW Specifications");

		System.out.println("Car Number: "+car_number);
		System.out.println("Color: "+color);
		System.out.println("Wheels: "+wheels);
		System.out.println("Engine"+engine);
		System.out.println("Happily BMW running !!!");
	}
	
	
}
