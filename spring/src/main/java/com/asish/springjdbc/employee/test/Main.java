package com.asish.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asish.springjdbc.employee.dao.impl.EmployeeDAOImpl;
import com.asish.springjdbc.employee.dto.EmployeeDTO;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/asish/springjdbc/employee/test/config.xml");
		
		// Create object of EmployeeDTO class
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setId(2);
		employeeDTO.setFname("Abhisekh");
		employeeDTO.setLname("Samantaray");
		employeeDTO.setEmail("abhisekh.samantaray@gmail.com");
		
		EmployeeDAOImpl daoImpl = (EmployeeDAOImpl) context.getBean("employeeDAOImpl");
		
//		int c = daoImpl.insertEmployee(employeeDTO);
//		System.out.println("Number of record inserted: "+c);
		
		// Show all records..
		System.out.println(daoImpl.showAllEmployee());
	}

}
