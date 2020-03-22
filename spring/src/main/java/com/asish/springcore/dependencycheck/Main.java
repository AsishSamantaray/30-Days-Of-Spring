package com.asish.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/asish/springcore/dependencycheck/config.xml");
		
		// Get the Prescription Object.
		Prescription prescription = (Prescription) context.getBean("prescription");
		
		// Print the Prescription obj..
		System.out.println(prescription);
		

	}
}
