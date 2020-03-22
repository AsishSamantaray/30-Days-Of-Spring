package com.asish.springadvanced.propertyplaceholder;

public class MyDAO {
	private String dbURL;
	private String dbUser;
	private String dbPassword;

	public MyDAO(String dbURL, String dbUser, String dbPassword) {
		super();
		this.dbURL = dbURL;
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
	}

	@Override
	public String toString() {
		return "MyDAO [dbURL=" + dbURL + ", dbUser=" + dbUser + ", dbPassword=" + dbPassword + "]";
	}

}
