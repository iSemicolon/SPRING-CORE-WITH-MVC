package org.kol.ConstructorApp;

public class Engine {

	private int engine_number;
	private String engine_type;
	private String engine_model;
	
	public Engine(int engine_number, String engine_type,String engine_model) {
		
		super();
		this.engine_number=engine_number;
		this.engine_type=engine_type;
		this.engine_model=engine_model;

	}

	@Override
	public String toString() {
		return "Engine [engine_number=" + engine_number + ", engine_type=" + engine_type + ", engine_model="
				+ engine_model + "]";
	}
	
	
	
}
