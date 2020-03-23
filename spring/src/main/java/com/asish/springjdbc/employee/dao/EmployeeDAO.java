package com.asish.springjdbc.employee.dao;

import java.util.List;

import com.asish.springjdbc.employee.dto.EmployeeDTO;

public interface EmployeeDAO {

	// Insert record..
	public int insertEmployee(EmployeeDTO employee);

	// Display all record..
	public List<EmployeeDTO> showAllEmployee();
}
