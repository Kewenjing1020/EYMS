package Restaurant;

import java.util.ArrayList;

public class Restaurant {
	
	/*
	 * Attributes
	 */
	private String Resto_name;
	
	private ArrayList<Personnel> users;
	
	/**set the stock of ingredient in the restaurant
	 * //HashMap<Ingredient(food_material,price), stock_quantity>
	 */
	private ArrayList<Meal> meals;
	//protected RestoIdentification identification = new RestoIdentification();
	
	
	/*
	 * Getters and Setters
	 */
	

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
		this.meals=new ArrayList<Meal>();
		
	}
	/**
	 * 
	 */
	public Restaurant() {
		super();
	}
	
	
}
