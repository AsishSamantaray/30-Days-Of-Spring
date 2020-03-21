package com.asish.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// Create ClassPathXmlApplicationContext object which help to get bean.
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Get Employee Object
		Employee employee = (Employee) context.getBean("employee");

		// Printing the employee object (toString())
		System.out.println(employee);
		
	}
}
