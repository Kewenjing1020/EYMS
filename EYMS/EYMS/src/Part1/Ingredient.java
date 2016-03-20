package wenjing.lucas.Part1.EYMS.src.Part1;

public class Ingredient {

	/*
	 * Attributes
	 */
	
	private String ingredient_name;		
	private String ingredient_detail;
	
	
	
	/**
	 * constructor
	 */
	public Ingredient() {
		super();
	}
	
	/**
	 * @param ingredient_name
	 * @param ingredient_detail
	 */
	public Ingredient(String ingredient_name, String ingredient_detail) {
		super();
		this.ingredient_name = ingredient_name;
		this.ingredient_detail = ingredient_detail;
	}


	@Override
	public String toString() {
		return "["+ingredient_name + ingredient_detail + "]";
	}
	
	public String getIngredient_name() {
		return ingredient_name;
	}
	public void setIngredient_name(String ingredient_name) {
		this.ingredient_name = ingredient_name;
	}
	public String getIngredient_detail() {
		return ingredient_detail;
	}
	public void setIngredient_detail(String ingredient_detail) {
		this.ingredient_detail = ingredient_detail;
	}
	
}
