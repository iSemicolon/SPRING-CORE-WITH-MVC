package org.kol.SetterInjectionApp;

public class Engine {
	
	private int engine_number;
	private String engine_type;
	private String engine_model;
	
	
	public int getEngine_number() {
		return engine_number;
	}
	public void setEngine_number(int engine_number) {
		this.engine_number = engine_number;
	}
	public String getEngine_type() {
		return engine_type;
	}
	public void setEngine_type(String engine_type) {
		this.engine_type = engine_type;
	}
	public String getEngine_model() {
		return engine_model;
	}
	public void setEngine_model(String engine_model) {
		this.engine_model = engine_model;
	}
	
	@Override
	public String toString() {
		return "Engine [engine_number=" + engine_number + ", engine_type=" + engine_type + ", engine_model="
				+ engine_model + "]";
	}
	
	
	
	

}
