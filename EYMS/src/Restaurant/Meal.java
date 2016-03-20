package Restaurant;

public class Meal {
	
	protected String dish_name;
	protected String ingredient_detail;
	protected Double price;
	protected Double special_price;
	public Double getSpecial_price() {
		return special_price;
	}


	public void setSpecial_price(Double special_price) {
		this.special_price = special_price;
	}
	protected Integer stock;
	protected Integer quantity;
	/**
	 * @param dish_name
	 * @param ingredient_detail
	 */
	public Meal() {
		super();
	}	
	
	/**
	 * @param dish_name
	 * @param ingredient_detail
	 * @param price
	 * @param stock
	 * @param quantity
	 */
	public Meal(String dish_name, String ingredient_detail, Double price) {
		super();
		this.dish_name = dish_name;
		this.ingredient_detail = ingredient_detail;
		this.price = price;
		this.quantity = 1;
	}
	
	public void add_to_cart(int qty){
		this.quantity=qty;
	}
	
	
	
	
	
	


	public String getDish_name() {
		return dish_name;
	}
	public void setDish_name(String dish_name) {
		this.dish_name = dish_name;
	}
	public String getIngredient_detail() {
		return ingredient_detail;
	}
	public void setIngredient_detail(String ingredient_detail) {
		this.ingredient_detail = ingredient_detail;
	}
	public Double getPrice() {
		if(special_price!=-1)
			return special_price;
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
}
