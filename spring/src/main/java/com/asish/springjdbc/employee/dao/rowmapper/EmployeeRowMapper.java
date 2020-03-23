package com.asish.springjdbc.employee.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.asish.springjdbc.employee.dto.EmployeeDTO;

public class EmployeeRowMapper implements RowMapper<EmployeeDTO>{

	@Override
	public EmployeeDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setId(rs.getInt(1));
		dto.setFname(rs.getString(2));
		dto.setLname(rs.getString(3));
		dto.setEmail(rs.getString(4));
		return dto;
	}
	
	

}
