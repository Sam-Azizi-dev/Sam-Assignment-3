package com.coderscampus;

public class SaveUser {

	public Users createUser(String[] userData) {

		Users user = new Users();

		user.setUsername(userData[0]);
		user.setPassword(userData[1]);
		user.setName(userData[2]);

		return user;

	}

	public String[] parseUserData(String input) {

		String[] arrayOfString = input.split(",");

		return arrayOfString;

	}

}
