package com.javabrains.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class InnerBeanDrawingApp {

	public static void main(String[] args) {
		/*
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle2 triangle2 = (Triangle2)context.getBean("triangle2");
		triangle2.draw(); 
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\javabrains\\innerbean\\spring.xml");
		//InnerBeanTraiangle innerBeanTraiangle = (InnerBeanTraiangle)context.getBean("innerBeanTraiangle");
		//InnerBeanTriangle innerBeanTraiangle = (InnerBeanTriangle)context.getBean("triangle-alias");
		InnerBeanTriangle innerBeanTraiangle = (InnerBeanTriangle)context.getBean("triangle-name");
		innerBeanTraiangle.draw();
	}
}
