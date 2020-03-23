package com.asish.springjdbc.employee.dto;

public class EmployeeDTO {
	private int id;
	private String fname;
	private String lname;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}

}
