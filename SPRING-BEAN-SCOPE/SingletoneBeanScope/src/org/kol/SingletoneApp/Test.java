package org.kol.SingletoneApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		
		System.out.println("Spring Object !!");
		Student student1=(Student) context.getBean("std");
		System.out.println(student1.hashCode());
		
		Student student2=(Student) context.getBean("std");
		System.out.println(student2.hashCode());
		
		
		System.out.println("Java Object !!");
		Student st1=new Student();
		System.out.println(st1.hashCode());
		
		Student st2=new Student();
		System.out.println(st2.hashCode());
		
		
	}
}
