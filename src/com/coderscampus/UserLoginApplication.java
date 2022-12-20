package com.coderscampus;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner scanner = new Scanner(System.in);
		UserService userService = new UserService();
		Users[] users = userService.exportUsersFromFile();
		String name;
		int counter;

		for (counter = 0; counter < 5; counter++) {
			System.out.print("Enter your email:");
			String userName = scanner.nextLine();
			System.out.print("Enter your password:");
			String password = scanner.nextLine();
			name = userService.validationUser(users, userName, password);
			if (name != null) {
				System.out.println("Welcome:" + name);
				break;
			} else if (counter != 4) {
				System.out.println("Invalid login, please try again");
			}
		}
		if (counter == 5) {
			System.out.println("Too many failed login attempts, you are now locked out.");
		}
		scanner.close();
	}
}
