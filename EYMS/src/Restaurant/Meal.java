package Restaurant;

public class Meal {
	
	
	public static void main(String [] args){
		Meal e=new Meal();
		e.setDish_name("Mixed garden salad");
		e.setIngredient_detail("drizzled with your choice of our homemade dressing served with bread");
		e.setPrice(2.2);
		e.setSpecial_price(1.5);
		e.setStock(100);
		System.out.println(e);
		
		Meal e1=new Meal("Spaghetti Bolognese"," with a lean meat sauce accompanied by grated parmesan cheese",3.2);
		System.out.println(e1.getPrice());
		
		
		Meal e2=new Meal();
		e2.setDish_name("Salmon Steak");
		e2.setIngredient_detail("baked with lemon grass herb butter and tomato-mussel coulis");
		e2.setPrice(5.0);
		e2.setStock(100);
		System.out.println(e2);
		
		Order order1=new Order();
		order1.add_meal(e, 1);
		System.out.println(e);
		
		order1.add_meal(e2, 2);
		
		System.out.println(e2.getPrice());
		
		order1.check();
		System.out.println(order1);
		System.out.println(order1.getTot_price());
		//System.out.println(e);
		
	}
	
	private String dish_name;
	private String ingredient_detail;
	private Double price;
	private Double special_price;
	
	public Double getSpecial_price() {
		return special_price;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Meal:" + dish_name + ", ingredient_detail=" + ingredient_detail + ", price=" + price
				+ ", special_price=" + special_price + ", stock=" + stock + ", quantity need for client=" + quantity + "\n";
	}





	public void setSpecial_price(Double special_price) {
		this.special_price = special_price;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	protected Integer stock;
	protected Integer quantity;
	/**
	 * @param dish_name
	 * @param ingredient_detail
	 */
	public Meal() {
		super();
		this.price = price;
		this.quantity = 1;
		this.special_price=(double) -1;
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
		this.special_price=(double) -1;
	}
	
//	public void add_to_cart(int qty){
//		this.quantity=qty;
//	}
	
	

	//getter and setter
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
		if(this.special_price!=-1)
			return special_price;
		else
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
//	public void setQuantity(Integer quantity) {
//		this.quantity = quantity;
//	}
	
	
}
