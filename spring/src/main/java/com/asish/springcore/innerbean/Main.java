package com.asish.springcore.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/asish/springcore/innerbean/config.xml");

		// Get the Employee Object.
		Employee employee = (Employee) context.getBean("employee");

		// Print the Employee obj..
		System.out.println(employee);
	}
}
