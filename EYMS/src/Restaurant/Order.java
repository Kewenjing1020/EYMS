package Restaurant;

import java.util.ArrayList;

public class Order extends Meal{
	
	public ArrayList<Meal> dish;
	private ArrayList<Ingredient> local_ingredient;
	private double total_price;
	private int total_points;
	
	/**
	 *constructor
	 */
	public Order() {
		super();
		this.dish=new ArrayList<Meal>();
		this.local_ingredient=new ArrayList<Ingredient>();
		this.total_price = 0;
		this.total_points=0;
	}


	public ArrayList<Ingredient> getLocal_ingredient() {
		return local_ingredient;
	}


	public void setLocal_ingredient(ArrayList<Ingredient> local_ingredient) {
		this.local_ingredient = local_ingredient;
	}


	public void add_meal(Meal dish_name){
		 this.dish.add(dish_name);
		 this.total_price+= dish_name.price;
		 this.total_points+=dish_name.points;
		 if(dish_name.getIngredients() == null){
			 break;
		 }else if((dish_name.getIngredients()!= null){
			 for(int i=0;i<dish_name.getIngredients().size();i++){
				 for(int j=0; j<this.local_ingredient.size();j++){
					 
					 if(dish_name.getIngredients())
				 }
			 }
		 }
		 
	}
	
	public void delete_meal(Meal dish_name){
		for(int i=0; i<this.dish.size();i++){
			if(this.dish.get(i).equals(dish_name))
				this.dish.remove(i);
		}		
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
