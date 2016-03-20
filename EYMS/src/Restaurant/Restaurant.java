package Restaurant;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

import Restaurant.Ingredient.food_material;


public class Restaurant {
	
	/*
	 * Attributes
	 */
	private String Resto_name;
	
	private ArrayList<Personnel> users;
	//set the stock of ingredient in the restaurant
	private Map<food_material,Float> ingredient_stock;
	//set the price of each ingredient
	private Map<food_material,Float> ingredient_price;
	private ArrayList<Meal> meals;
	//protected RestoIdentification identification = new RestoIdentification();
	
	
	/*
	 * Getters and Setters
	 */
	
	public Map<food_material, Float> getIngredient_stock() {
		return ingredient_stock;
	}
	public void setIngredient_stock(Map<food_material, Float> ingredient_stock) {
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
	public Map<food_material, Float> getIngredient_price() {
		return ingredient_price;
	}
	public void setIngredient_price(Map<food_material, Float> ingredient_price) {
		this.ingredient_price = ingredient_price;
	}
	
	
	/**constructor
	 * @param resto_name
	 */
	public Restaurant(String resto_name) {
		super();
		this.Resto_name = resto_name;
		this.ingredient_stock=new HashMap<food_material,Float> ();
		this.ingredient_price=new HashMap<food_material,Float> ();
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
