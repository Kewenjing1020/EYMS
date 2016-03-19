package EYMS.EYMS.src.Restaurant;

public enum Ingredient {

	Salad("Salad",100f,1f),
	Potatoes("Potatoes",100f,3f),
	Bacon("Bacon",50f,8f),
	Beaf("Beaf",50f,10f),
	Ketchup("Ketchup",100f,2f),
	Mustard("Mustard",100f,3f),
	Onions("Onions",80f,2f),
	Tomatoes("Tomatoes",100f,3f),
	Bun("Bun",200f,5f);
	
	
	/**
	 * Attributes
	 */
	
	private String name;
	//ingredient includes the stock in kg available in a restaurant;
	//as a result it will be possible to raise an error if stock are 
	//not enough for the command of a client
	private Float stock;
	//Price for one kg
	private Float price;
	
	/**
	 * Getters and Setters
	 */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//We use a synchronized method because several users can access 
	//to stock at once
	public synchronized Float getStock() {
		return stock;
	}
	//We use a synchronized method because several users can access 
	//to stock at once
	public synchronized void setStock(Float stock) {
		this.stock = stock;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 
	 * Constructor
	 */
	
	Ingredient(String name, Float stock, Float price) {
		this.name = name;
		this.stock = stock;
		this.price = price;
	}
	
	/**
	 * Methods
	 */
	
	//adding of a quantity of the ingredient
	public synchronized void add(Float quantity){
		stock += quantity;
	}
	
	//removal of a quantity of the ingredient for example for a command
	public synchronized void remove(Float quantity) 
			throws RuptureDeStockIngredientException{
		if(stock < quantity)
			throw new RuptureDeStockIngredientException(this, quantity);
		else{
			stock -= quantity;
		}
	}
	
}
