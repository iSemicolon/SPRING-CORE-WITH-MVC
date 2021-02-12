package org.btm.ApplicationContextApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
	HelloWorld hw=(HelloWorld) context.getBean("hello");
		
		hw.display();
	}

}
