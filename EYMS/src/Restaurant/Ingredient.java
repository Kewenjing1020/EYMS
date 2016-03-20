package Restaurant;

public class Ingredient {

	public static void main(String [] args){
		Ingredient mon_salad=new Ingredient(food_material.Salad,100f);
		System.out.println(mon_salad);
	}
	
	/**
	 * define the choice of ingredient
	 * @author kewenjing
	 *
	 */
	public enum food_material{
		Salad, Patato, Bacon, Beaf, Ketchup, Mustard, Onion, Tomato, Bun;
	}
	
	/**
	 * Attributes
	 */
	
	private food_material name;
	private Float price;
	//ingredient includes the stock in kg available in a restaurant;
	//as a result it will be possible to raise an error if stock are 
	//not enough for the command of a client
	

	/**constructor
	 * @param name
	 * @param price
	 */
	public Ingredient(food_material name, Float price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Ingredient stock \n [food_material" + name + ", price=" + price + "]";
	}

	
	/**
	 * Getters and Setters
	 */
	
	public food_material getName() {
		return name;
	}
	
	public Float getPrice() {
		return price;
	}

	public synchronized void setPrice(Float price) {
		this.price = price;
	}


	
}
