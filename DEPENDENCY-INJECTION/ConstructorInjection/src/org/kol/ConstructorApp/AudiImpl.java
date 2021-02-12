package org.kol.ConstructorApp;

public class AudiImpl implements ICar{

	public AudiImpl() {

	System.out.println("Audi Object Created !!");
	}

	@Override
	public void drive() {

		System.out.println("Happily Audi Running !!!");
	}
	
	
}
