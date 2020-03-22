package com.asish.springadvanced.autowiringannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component	// Used to get the object of the class
public class Employee {
	private int eid;
	private String name;
	
	@Autowired	// Used to set value to a reference type variable. (By default it is by Type)
	@Qualifier("address2")	// To use bean by Name use @Qualifier.
	private Address address;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	
	// Setter Method is optional.
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", address=" + address + "]";
	}

}
