package EYMS.EYMS.src.Operation;

import EYMS.EYMS.src.Restaurant.Restaurant;
import EYMS.EYMS.src.User.User;

/**
 * Login Method for client which allows them to login
 * @author Lucas
 *
 */
public class LoginClient implements Login{

	@Override
	public void login(Restaurant resto, User user) {
		System.out.println("Hi I want to connect");
		System.out.println("Please enter your username and your password:");
		System.out.println("username: " + user.getUsername());
		System.out.println("password: " + user.getPassword());
		boolean isIdentify = resto.identify(resto, user.getUsername(), user.getPassword());
		if(isIdentify)
		{
			System.out.println("Welcome to EYMS " + user.getFirstName() 
								+ " " + user.getLastName());
		}
		else
		{
			System.out.println("Please try again later or register you");
		}
		
		
	}


		
}

	

