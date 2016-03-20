package EYMS.EYMS.src.User;


import java.io.Serializable;
import java.util.ArrayList;

import EYMS.EYMS.src.FidelityCard.FidelityCard;
import EYMS.EYMS.src.Operation.Login;
import EYMS.EYMS.src.Operation.LoginClient;
import EYMS.EYMS.src.Restaurant.*;

public class Client extends User implements Serializable {



	private static final long serialVersionUID = -55857686305273843L;
	
	private Boolean authorization;
	private String birthday;
	private FidelityCard fidelityCard;
	private Login login = new LoginClient();
	private ArrayList<String> contacterNames;
	private ArrayList<String> email;
	private ArrayList<String> phoneNumber;
	private ArrayList<String> address;
	private ArrayList<Meal> favoriteMeals;
	
	/**
	 * Constructor
	 * @param username
	 * @param password
	 */
	
	public Client(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void writeUser() {
		// TODO Auto-generated method stub
		
	}





	public Boolean getAuthorization() {
		return authorization;
	}

	public void setAuthorization(Boolean authorization) {
		this.authorization = authorization;
	}

	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public FidelityCard getFidelityCard() {
		return fidelityCard;
	}


	public void setFidelityCard(FidelityCard fidelityCard) {
		this.fidelityCard = fidelityCard;
	}


	public Login getLogin() {
		return login;
	}


	public void setLogin(Login login) {
		this.login = login;
	}


	public ArrayList<String> getContacterNames() {
		return contacterNames;
	}


	public void setContacterNames(ArrayList<String> contacterNames) {
		this.contacterNames = contacterNames;
	}


	public ArrayList<String> getEmail() {
		return email;
	}



	public void setEmail(ArrayList<String> email) {
		this.email = email;
	}


	public ArrayList<String> getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhone_number(ArrayList<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public ArrayList<String> getAddress() {
		return address;
	}


	public void setAddress(ArrayList<String> address) {
		this.address = address;
	}


	public ArrayList<Meal> getFavoriteMeals() {
		return favoriteMeals;
	}


	public void setFavoriteMeals(ArrayList<Meal> favoriteMeals) {
		this.favoriteMeals = favoriteMeals;
	}
	
}
