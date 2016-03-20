package Restaurant;

import java.util.ArrayList;


import User.User;


public class Restaurant {
	
	/*
	 * Attributes
	 */
	private String Resto_name;
	
	private ArrayList<User> users;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<Meal> meals;
	protected RestoIdentification identification = new RestoIdentification();
	
	
	/*
	 * Getters and Setters
	 */
	
	public ArrayList<User> getUsers() {
		return users;
	}
	public String getResto_name() {
		return Resto_name;
	}
	public void setResto_name(String resto_name) {
		Resto_name = resto_name;
	}
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public ArrayList<Meal> getMeals() {
		return meals;
	}
	public void setMeals(ArrayList<Meal> meals) {
		this.meals = meals;
	}
	

	/**
	 * @param resto_name
	 * @param users
	 * @param ingredients
	 * @param meals
	 */
	public Restaurant(String resto_name, ArrayList<User> users, ArrayList<Ingredient> ingredients,
			ArrayList<Meal> meals) {
		super();
		Resto_name = resto_name;
		this.users = users;
		this.ingredients = ingredients;
		this.meals = meals;
	}
	
	/**
	 * Constructor
	 * @param users
	 * @param ingredients
	 * @param meals
	 */
	public Restaurant(ArrayList<User> users, ArrayList<Ingredient> ingredients, ArrayList<Meal> meals) {
		super();
		this.users = users;
		this.ingredients = ingredients;
		this.meals = meals;
	}
	
	/**
	 * Methods
	 */
	
	public boolean identify(Restaurant resto, String username, String password){
		boolean res = identification.identify(resto, username, password);
		return res;
	}

}
