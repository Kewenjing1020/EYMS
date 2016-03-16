package wenjing.lucas.Part1.EYMS.src.Part1;

import java.util.ArrayList;

public class Meal {
	protected String dish_name;
	protected ArrayList<String> ingredients_names;
	protected ArrayList<Float> ingredient_qty;
	protected double price;
	//number of points that you get when you order the meal
	protected int points;
	private double special_price;
	
	/**
	 * Getters and Setters
	 * @return
	 */
	
	public String getDish_name() {
		return dish_name;
	}
	public ArrayList<String> getIngredients_names() {
		return ingredients_names;
	}
	public void setIngredients_names(ArrayList<String> ingredients_names) {
		this.ingredients_names = ingredients_names;
	}
	public ArrayList<Float> getIngredient_qty() {
		return ingredient_qty;
	}
	public void setIngredient_qty(ArrayList<Float> ingredient_qty) {
		this.ingredient_qty = ingredient_qty;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public double getSpecial_price() {
		return special_price;
	}
	public void setSpecial_price(double special_price) {
		this.special_price = special_price;
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
	public Meal(String dish_name, double price) {
		super();
		this.dish_name = dish_name;
		this.price = price;
		if(this.special_price!=-1){
			this.price=special_price;
		}
	}
	
	
	

}
