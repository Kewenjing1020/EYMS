package EYMS.EYMS.src.User;

import java.util.ArrayList;

import EYMS.EYMS.src.Operation.Login;


public abstract class User {

	/** 
	 * Attributes
	 */
	
	//allow to guaranty that password is unique for each User
	protected static ArrayList<String> passwords;
	protected String username;
	protected String firstName;
	protected String lastName;
	protected String password;
	protected Login login;
	
	
	/**
	 * @param username
	 * @param password
	 */
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
<<<<<<< HEAD
	
	public abstract void writeUser();
	
	
	
	
=======
		
>>>>>>> b6920cf7f7bf793067aee35f60fa07e2ceff7d00
	/**
	 * Getters and Setters
	 */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String first_name) {
		this.firstName = first_name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String last_name) {
		this.lastName = last_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
	

