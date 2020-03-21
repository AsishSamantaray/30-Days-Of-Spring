package com.asish.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/asish/springcore/map/mapconfig.xml");

		// Get the Customer class Object..
		Customer customer = (Customer) context.getBean("customer");
		
		System.out.println(customer);
	}
}
