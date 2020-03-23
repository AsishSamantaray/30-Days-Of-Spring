package com.asish.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.asish.springjdbc.employee.dao.EmployeeDAO;
import com.asish.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.asish.springjdbc.employee.dto.EmployeeDTO;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int insertEmployee(EmployeeDTO employee) {
		String sql = "INSERT INTO users_details values(?,?,?,?)";
		int c = jdbcTemplate.update(sql, employee.getId(), employee.getFname(), employee.getLname(),
				employee.getEmail());
		return c;
	}
	
	@Override
	public List<EmployeeDTO> showAllEmployee() {
		List<EmployeeDTO> allRow = jdbcTemplate.query("SELECT * FROM users_details", new EmployeeRowMapper());
		return allRow;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

}
