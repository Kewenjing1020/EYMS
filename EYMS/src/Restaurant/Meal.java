package Restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Restaurant.Ingredient;

public class Meal {
	
	protected String dish_name;
	protected ArrayList<Ingredient> ingredient_list;
	
	/**ingredient_stantard
	 * HashMap<Ingredient(food_material,price), qty>
	 */
	protected Map<Ingredient,Float> ingredient_stantard;
	
	/**ingredient_add
	 * to facilite the display when an ingredient being added
	 * ex: Meal ***, Attention: add_ingredient<tomato, 1>
	 * 
	 */
	protected Map<Ingredient,Float> ingredient_add;

	/**
	 * After adding ingredient, the local_ingredient in this meal
	 */
	protected Map<Ingredient,Float> ingredient_local;

	protected double price;
	//number of points that you get when you order the meal
	protected int points;
	private double special_price;
	
	/**
	 * Getters and Setters
	 * @return
	 */
	
	
	public Map<Ingredient,Float> getIngredient_stantard() {
		return ingredient_stantard;
	}
	public void setIngredient_stantard(Map<Ingredient, Float> ingredient_stantard) {
		this.ingredient_stantard = ingredient_stantard;
	}
	public Map<Ingredient, Float> getIngredient_add() {
		return ingredient_add;
	}
	public void setIngredient_add(Map<Ingredient, Float> ingredient_add) {
		this.ingredient_add = ingredient_add;
	}
	public Map<Ingredient, Float> getIngredient_local() {
		return ingredient_local;
	}
	public void setIngredient_local(Map<Ingredient, Float> ingredient_local) {
		this.ingredient_local = ingredient_local;
	}
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
		this.ingredient_stantard=new HashMap<Ingredient,Float>();
		this.ingredient_add=new HashMap<Ingredient,Float>();
		this.ingredient_local=this.ingredient_stantard;
	}
	
	/**
	 * change the price when adding an ingredient
	 * @param ingredient
	 * @param add_quantity
	 */
	public void add_ingredient(Ingredient ingredient, Float add_qty){
		this.ingredient_add.put(ingredient, add_qty);
		this.price+=ingredient.getPrice()*add_qty;
	}
	
	

	
	

}
