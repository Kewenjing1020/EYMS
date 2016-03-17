package Restaurant;

import java.util.ArrayList;

public class Meal {
	protected String dish_name;
	//Quantities of ingredients needed for the meal
	//If an ingredient is not used his quantity is set to 0
	protected ArrayList<Float> ingredient_qty;
	protected ArrayList<Ingredient> ingredients;
	protected double price;
	//number of points that you get in fidelity card when you order the meal
	protected int points;
	
	/**
	 * Getters and Setters
	 * @return
	 */
	
	public String getDish_name() {
		return dish_name;
	}
	public ArrayList<Float> getIngredient_qty() {
		return ingredient_qty;
	}
	public void setIngredient_qty(ArrayList<Float> ingredient_qty) {
		this.ingredient_qty = ingredient_qty;
	}
	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public void setDish_name(String dish_name) {
		this.dish_name = dish_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Constructor
	 */
	public Meal() {
		super();
	}
	/**
	 * @param dish_name
	 * @param price
	 */
	public Meal(String dish_name, double price ) {
		super();
		this.dish_name = dish_name;
		this.price = price;
	}
	/**
	 * @param dish_name
	 * @param price
	 * @param points
	 */
	public Meal(String dish_name,double price,int points) {
		super();
		this.dish_name = dish_name;
		this.ingredient_qty = new ArrayList<Float> ();
		this.ingredients = new ArrayList<Ingredient>();
		this.price = price;
		this.points = points;
	}
	
	
	

}
