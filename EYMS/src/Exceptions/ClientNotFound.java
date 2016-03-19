package Exceptions;

/**
 * Exception raised when a Login fails
 * 
 * @author Lucas
 *
 */
public class ClientNotFound extends Exception {

	public ClientNotFound(String username, String password){
		System.err.println("No Client found corresponding to the username: " + username 
				+ " and the password: " + password + ".\n"
				+ " Please try again or register");
	}
}
