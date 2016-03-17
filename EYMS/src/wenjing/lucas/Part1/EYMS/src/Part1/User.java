package wenjing.lucas.Part1.EYMS.src.Part1;

import java.util.ArrayList;

import User.Login;


public abstract class User {

	/** 
	 * Attributes
	 */
	
	//allow to guaranty that username is unique for each User
	protected static ArrayList<String> username_group;
	protected String username;
	protected String password;
	protected Login login;
	
	/**
	 * Getters and Setters
	 */
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
	

