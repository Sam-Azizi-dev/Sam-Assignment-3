package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {

	public User[] exportUsersFromFile() throws FileNotFoundException, IOException {
		User[] users = new User[5];
		BufferedReader fileReader = null;
		String userProperties = "";
		int i = 0;
		fileReader = new BufferedReader(new FileReader("data.txt"));
		while ((userProperties = fileReader.readLine()) != null) {
			users[i] = new User(userProperties.split(","));
			i++;
		}
		fileReader.close();
		return users;
	}

}
