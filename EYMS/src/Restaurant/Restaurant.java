package Restaurant;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

import Restaurant.Ingredient;


public class Restaurant {
	
	/*
	 * Attributes
	 */
	private String Resto_name;
	
	private ArrayList<Personnel> users;
	
	/**set the stock of ingredient in the restaurant
	 * //HashMap<Ingredient(food_material,price), stock_quantity>
	 */
	private Map<Ingredient,Float> ingredient_stock;
	private ArrayList<Meal> meals;
	//protected RestoIdentification identification = new RestoIdentification();
	
	
	/*
	 * Getters and Setters
	 */
	
	public Map<Ingredient, Float> getIngredient_stock() {
		return ingredient_stock;
	}
	public void setIngredient_stock(Map<Ingredient, Float> ingredient_stock) {
		this.ingredient_stock = ingredient_stock;
	}
	public ArrayList<Personnel> getUsers() {
		return users;
	}
	public String getResto_name() {
		return Resto_name;
	}
	public void setResto_name(String resto_name) {
		Resto_name = resto_name;
	}
	public void setUsers(ArrayList<Personnel> users) {
		this.users = users;
	}

	public ArrayList<Meal> getMeals() {
		return meals;
	}
	public void setMeals(ArrayList<Meal> meals) {
		this.meals = meals;
	}
	
	
	/**constructor
	 * @param resto_name
	 */
	public Restaurant(String resto_name) {
		super();
		this.Resto_name = resto_name;
		this.ingredient_stock=new HashMap<Ingredient,Float> ();
		this.meals=new ArrayList<Meal>();
		
	}
	/**
	 * 
	 */
	public Restaurant() {
		super();
	}
	
	
	/**
	 * Methods
	 */
	
//	public boolean identify(Restaurant resto, String username, String password){
//		boolean res = identification.identify(resto, username, password);
//		return res;
//	}

}
