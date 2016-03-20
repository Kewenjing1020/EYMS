package Restaurant;

public class Ingredient {

	public static void main(String [] args){
		Ingredient mon_salad=new Ingredient(food_material.Salad,100f);
		System.out.println(mon_salad);
	}
	
	
	@Override
	public String toString() {
		return "Ingredient stock \n [food_material" + name + ", price=" + price + "]";
	}


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


	/**constructor
	 * @param name
	 * @param price
	 */
	public Ingredient(food_material name, Float price) {
		super();
		this.name = name;
		this.price = price;
	}


	
	
	

	
//	//removal of a quantity of the ingredient for example for a command
//	public synchronized void remove(Float quantity) 
//			throws RuptureDeStockIngredientException{
//		if(stock < quantity)
//			throw new RuptureDeStockIngredientException(this, quantity);
//		else{
//			stock -= quantity;
//		}
//	}
	
}
