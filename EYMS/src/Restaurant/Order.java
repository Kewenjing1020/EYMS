package Restaurant;

import java.util.ArrayList;

public class Order{
	
	private ArrayList<Meal> meal_list;
	private Double tot_price;
	//leave the message for the special demand of the meals
	private String personalization;

	
	
	/**
	 * @param meal_list
	 * @param tot_price
	 */
	public Order() {
		super();
		this.meal_list = new ArrayList<Meal>();
		this.tot_price=(double) 0;
		this.personalization=null;
	}

	public void add_meal(Meal e,int qty){
		if (e.stock>=qty){
			e.quantity=qty;
			meal_list.add(e);
			System.out.println(e.quantity+ " shares of in your cart now");
		}
		else if(e.stock==0){
			System.out.println("this meal is sold out ");
		}else{
			System.out.println("there are "+ e.stock+"shares in stock, please change the quantity you need");
		}
		
	}
	
	public void remove_meal(Meal e){
		meal_list.remove(e);
	}
	
	public void check(){
		for(Meal e:this.meal_list){
			e.stock-=e.quantity;
			this.tot_price+=e.price*e.quantity;
		}
	}
	
	
	
	//getter and setter
	public ArrayList<Meal> getMeal_list() {
		return meal_list;
	}

	public void setMeal_list(ArrayList<Meal> meal_list) {
		this.meal_list = meal_list;
	}

	public Double getTot_price() {
		return tot_price;
	}

	public void setTot_price(Double tot_price) {
		this.tot_price = tot_price;
	}

	public String getPersonalization() {
		return personalization;
	}

	public void setPersonalization(String personalization) {
		this.personalization = personalization;
	}

	
	
}
