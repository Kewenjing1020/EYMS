package wenjing.lucas.Part1.EYMS.src.Part1;

import java.util.ArrayList;

public class Order extends Meal{
	
	public ArrayList<Meal> dish;
	private double total_price;
	
	
	
	/**
	 *constructor
	 */
	public Order() {
		super();
		this.dish=new ArrayList<Meal>();
		this.total_price = 0;
	}


	public void add_meal(Meal dish_name){
		 this.dish.add(dish_name);
		 this.total_price+= dish_name.price;
	}


	public ArrayList<Meal> getDish() {
		return dish;
	}


	public void setDish(ArrayList<Meal> dish) {
		this.dish = dish;
	}


	public double getTotal_price() {
		return total_price;
	}


	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	


}
