package EYMS.EYMS.src.Operation;

import EYMS.EYMS.src.Restaurant.Restaurant;

public interface Identification {

	//method of a restaurant
	//return true if the username and the password of a user are correct
	public boolean identify(Restaurant resto, String username, String password);
	
}
