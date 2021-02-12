package org.kol.ConstructorApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		
		ICar i1=(ICar) context.getBean("bmw");
		i1.drive();
		
		
		ICar i2=(ICar) context.getBean("audi");
		i2.drive();
		
	}

}
