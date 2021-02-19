package org.kol.StereoTypeApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring.xml");
		FlipkartController flipkart=(FlipkartController) ctx.getBean(FlipkartController.class);
		
		flipkart.purchase();
		
	}

}
