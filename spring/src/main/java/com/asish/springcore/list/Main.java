package com.asish.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/asish/springcore/list/listconfig.xml");

		// Get the Hospital class Object..
		Hospital hospital = (Hospital) context.getBean("hospital");
		
		System.out.println(hospital);
	}
}
