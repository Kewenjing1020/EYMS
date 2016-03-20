package Restaurant;

import Part1.Client;

public interface Identification {

	//method of a restaurant
	//return true if the username and the password of a user are correct
	public boolean identify(Restaurant resto, String username, String password);
	public boolean identify(Client client, String username, String password);
	
}
