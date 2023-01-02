package com.coderscampus;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner scanner = new Scanner(System.in);
		UserService userService = new UserService();
		User loggedInUser = null;

		int counter;

		for (counter = 0; counter < 5; counter++) {
			System.out.print("Enter your email:");
			String userName = scanner.nextLine();
			System.out.print("Enter your password:");
			String password = scanner.nextLine();
			loggedInUser = userService.getUserByUsernameAndPassword(userName, password);
			if (loggedInUser != null) {
				System.out.println("Welcome:" + loggedInUser.getName());
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
