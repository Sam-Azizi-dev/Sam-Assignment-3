package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserLogin {

	public static void main(String[] args) throws IOException {
		UserLogin userLogin = new UserLogin();

		userLogin.getUsersFromFile();
	}

	private Users[] getUsersFromFile() throws FileNotFoundException, IOException {
		int i = 0;
		BufferedReader fileReader = null;

		fileReader = new BufferedReader(new FileReader("data.txt"));
		Users[] user = new Users[4];
		while ((fileReader.lines()) != null) {
			String userProperties = fileReader.readLine();
			SaveUser userdata = new SaveUser();

			user[i] = userdata.createUser(userdata.parseUserData(userProperties));
			System.out.println(user[i]);
			i++;
		}
		fileReader.close();
		return user;
	}
}
