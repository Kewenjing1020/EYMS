package EYMS.EYMS.src.Restaurant;

import java.util.ArrayList;

public class Meal {
	protected String dish_name;
	protected ArrayList<Ingredient> ingredients;
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
