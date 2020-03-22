package com.asish.springadvanced.autowiringannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/asish/springadvanced/autowiringannotation/config.xml");

		// Get the Employee Object.
		Employee employee = (Employee) context.getBean("employee");

		// Print the Employee obj..
		System.out.println(employee);
	}
}
