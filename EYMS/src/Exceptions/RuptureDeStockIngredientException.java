package Exceptions;

import Restaurant.Ingredient;

public class RuptureDeStockIngredientException extends Exception {

	public RuptureDeStockIngredientException(Ingredient ing, Float quantity){
		System.out.println("L'ingredient: " + ing.getName() +  
				"est en quantit�: " + ing.getStock() + " kg" +
				"et vous en demandez: " + quantity + " kg.");
	}
}
