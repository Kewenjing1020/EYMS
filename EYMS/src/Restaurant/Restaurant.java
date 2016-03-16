package Restaurant;

import java.util.ArrayList;

import User.User;

public class Restaurant {
	
	/*
	 * Attributes
	 */
	
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
