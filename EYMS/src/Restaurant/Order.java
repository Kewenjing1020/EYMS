package Restaurant;

import java.util.ArrayList;

public class Order extends Meal{
	
	public ArrayList<Meal> dish;
	private double total_price;
	private int total_points;
	
	/**
	 *constructor
	 */
	public Order() {
		super();
		this.dish=new ArrayList<Meal>();
		this.total_price = 0;
		this.total_points=0;
	}


	public void add_meal(Meal dish_name){
		 this.dish.add(dish_name);
		 this.total_price+= dish_name.price;
		 this.total_points+=dish_name.points;
		 
	}
	
	public void delete_meal(Meal dish_name){
		
	}

	public int getTotal_points() {
		return total_points;
	}


	public void setTotal_points(int total_points) {
		this.total_points = total_points;
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
