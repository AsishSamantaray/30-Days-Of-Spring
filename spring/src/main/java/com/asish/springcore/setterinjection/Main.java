package com.asish.springcore.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/asish/springcore/setterinjection/setterinjectionconfig.xml");

		// Get the University class Object..
		University university = (University) context.getBean("university");
		
		System.out.println(university);
	}
}
