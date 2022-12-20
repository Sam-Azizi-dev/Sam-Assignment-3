package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// this class is doing bunch of services to user application

public class UserService {

// this method is reading User's information from file and store them to array of String
	public Users[] exportUsersFromFile() throws FileNotFoundException, IOException {
		Users[] user = new Users[5];
		BufferedReader fileReader = null;
		String userProperties = "";
		int i = 0;
		fileReader = new BufferedReader(new FileReader("data.txt"));
		while ((userProperties = fileReader.readLine()) != null) {
			user[i] = createNewUser(parseUserData(userProperties));
			i++;
		}
		fileReader.close();
		return user;
	}

// split user's information (username , password , name) in different array
	public String[] parseUserData(String input) {
		String[] arrayOfString = input.split(",");
		return arrayOfString;
	}

// create new user object and store it with POJO
	public Users createNewUser(String[] userData) {
		Users user = new Users();
		user.setUsername(userData[0]);
		user.setPassword(userData[1]);
		user.setName(userData[2]);
		return user;
	}

// this method is searching in the user's information array for find the right match , 
// if it find right match return name 
	public String validationUser(Users user[], String username, String pass) {
		String validatedUser = null;
		for (int j = 0; j < 5; j++) {
			if (user[j].getUsername().equalsIgnoreCase(username)) {
				if (user[j].getPassword().equals(pass)) {
					validatedUser = user[j].getName();
					break;
				}
			}
		}
		return validatedUser;
	}

}
