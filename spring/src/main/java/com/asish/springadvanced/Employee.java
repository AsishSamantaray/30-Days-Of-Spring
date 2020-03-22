package com.asish.springadvanced;

public class Employee {
	private String name;
	private int eid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + "]";
	}

}
