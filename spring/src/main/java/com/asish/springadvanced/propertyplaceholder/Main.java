package com.asish.springadvanced.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/asish/springadvanced/propertyplaceholder/config.xml");

		// Get MyDAO Object
		MyDAO myDAO = (MyDAO) context.getBean("myDAO");

		// Printing the myDAO object (toString())
		System.out.println(myDAO);
	}
}
