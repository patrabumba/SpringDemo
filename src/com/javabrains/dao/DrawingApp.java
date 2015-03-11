package com.javabrains.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle triangle = (Triangle)beanFactory.getBean("triangle");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
				
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}
}
