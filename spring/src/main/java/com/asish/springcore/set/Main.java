package com.asish.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/asish/springcore/set/setconfig.xml");

		// Get the CarDealer class Object..
		CarDealer carDealer = (CarDealer) context.getBean("carDealer");
		
		System.out.println(carDealer);
	}
}
