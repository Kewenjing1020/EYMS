package Restaurant;

public class Stock {
	
	private Float stock_qty;
	private Ingredient ingredient;
	/**
	 * @param stock_qty
	 * @param ingredient
	 */
	public Stock(Float stock_qty, Ingredient ingredient) {
		super();
		this.stock_qty = stock_qty;
		this.ingredient = ingredient;
	}
	
	/**
	 * 
	 * @param stock_qty_add
	 */
	public void add_stock(Float stock_qty_add){
		this.stock_qty+=stock_qty_add;
	}
	
	/**
	 * 
	 * @param stock_qty_new
	 */
	public void change_stock(Float stock_qty_new){
		this.stock_qty=stock_qty_new;
	}
	
	
	/**
	 * getter and setter
	 * @return
	 */
	public Float getStock_qty() {
		return stock_qty;
	}
	public void setStock_qty(Float stock_qty) {
		this.stock_qty = stock_qty;
	}
	public Ingredient getIngredient() {
		return ingredient;
	}
	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
	
	
}
