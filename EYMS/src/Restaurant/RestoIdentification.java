package Restaurant;

import User.User;

public class RestoIdentification implements Identification {

	@Override
	public boolean identify(Restaurant resto, String username, String password) {
		Boolean res = false;
		//We test all the username and password of the user of the restaurant
		//until there is a match
		//otherwise we fail to identify the user
		for(User u: resto.getUsers())
		{
			if (u.getUsername().equals(username) && u.getPassword().equals(password)){
				res = true;
				break;
			}
		}
		if(res){
			System.out.println("Welcome !");
		}
		else{
			System.err.println("Your username or your password is incorrect");
		}
		//we return a boolean for further operation
		//true if identified false otherwise
		return res;
	}



	
}
