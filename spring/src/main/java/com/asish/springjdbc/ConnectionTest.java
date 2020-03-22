package com.asish.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/asish/springjdbc/dbConfig.xml");
		
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		
		String sql = "INSERT INTO users_details values(?,?,?,?)";
		int c = template.update(sql, new Integer(1), "Asish", "Sammantaray", "samantaray.asish04@gmail.com");
		System.out.println("Number of record inserted: "+c);
	}
}
