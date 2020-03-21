package com.asish.springcore.map;

import java.util.Map;

public class Customer {
	private int cid;
	private String name;
	private Map<Integer, String> products;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, String> getProducts() {
		return products;
	}

	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", products=" + products + "]";
	}

}
