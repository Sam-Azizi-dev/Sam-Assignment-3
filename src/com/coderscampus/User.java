package com.coderscampus;

public class User {
	private String username;
	private String password;
	private String name;

	public User() {
	}

	public User(String[] userData) {
		this.username = userData[0];
		this.password = userData[1];
		this.name = userData[2];

	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", name=" + name + "]";
	}

}
