package com.asish.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/asish/springcore/reftypes/reftypeconfig.xml");

		// Get the Student class Object..
		Student student = (Student) context.getBean("student");

		System.out.println(student);
	}
}