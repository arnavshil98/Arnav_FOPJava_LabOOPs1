package com.fop.lab1;

import java.util.HashMap;

public class CutomerDetails {

	static {
		System.out.println("Welcome to Axis bank!");
	}
	private String userName;
	private String password;

	public boolean validateCred(String user, String Pswd) throws Exception {
		HashMap<String, String> userPasswordComb = new HashMap<>();
		userPasswordComb.put("17109567891", "21540");
		userPasswordComb.put("67109561191", "32190");
		userPasswordComb.put("37119567891", "67190");

		if (userPasswordComb.get(user).equalsIgnoreCase(Pswd)) {
			System.out.println("credentials validated: " + user);
			return true;
		} else {
			throw new Exception("invalid credentials!");
		}

	}

	public CutomerDetails(String user, String password) throws Exception {
		this.userName = user;
		this.password = password;
		this.validateCred(user, password);
	}

	public String getUserName() {
		return userName;

	}

	public String getPassword() {
		return password;
	}
}
