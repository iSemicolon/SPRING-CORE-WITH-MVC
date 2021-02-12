package org.btm.BeanFactoryApp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String[] args) {
		
		Resource res=new ClassPathResource("Spring.xml");
		BeanFactory bef=new XmlBeanFactory(res);
		
	HelloWorld hlw=(HelloWorld) bef.getBean("hello");
		hlw.display();
		
		
		
	}

}
