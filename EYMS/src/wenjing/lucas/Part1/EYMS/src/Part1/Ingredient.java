package wenjing.lucas.Part1.EYMS.src.Part1;

public class Ingredient {

	/*
	 * Attributes
	 */
	
	private String name;
	//ingredient includes the stock in kg available in a restaurant;
	//as a result it will be possible to raise an error if stock are 
	//not enough for the command of a client
	private Float stock;
	private Float price;
	
	/*
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
	
	/*
	 * Constructor
	 */
	
	public Ingredient(String name, Float stock, Float price) {
		super();
		this.name = name;
		this.stock = stock;
		this.price = price;
	}
	
	/*
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
