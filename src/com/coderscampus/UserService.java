package com.coderscampus;

import java.io.FileNotFoundException;
import java.io.IOException;

public class UserService {

	private User[] users = new User[5];

	public UserService() {
		FileService fileService = new FileService();
		try {
			users = fileService.exportUsersFromFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public User getUserByUsernameAndPassword(String username, String pass) {
		for (int j = 0; j < 5; j++) {
			if (users[j].getUsername().equalsIgnoreCase(username) && users[j].getPassword().equals(pass)) {

				return users[j];

			}
		}
		return null;
	}

}
