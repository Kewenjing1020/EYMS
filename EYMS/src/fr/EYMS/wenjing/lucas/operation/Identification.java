package fr.EYMS.wenjing.lucas.operation;

import wenjing.lucas.Part1.EYMS.src.Part1.Restaurant;

public interface Identification {

	//method of a restaurant
	//return true if the username and the password of a user are correct
	public boolean identify(Restaurant resto, String username, String password);

	
}
