package Exceptions;

import Restaurant.Ingredient;

/**
 * Exception allowing to raise error when it's is not possible to provide the Ingredient 
 * or the Meal demanding by a Client for instance
 * 
 * @author Lucas
 *
 */

public class RuptureDeStockIngredientException extends Exception {

	public RuptureDeStockIngredientException(Ingredient ing, Float quantity){
		System.out.println("The ingredient: " + ing.getName() +  
				"is in quantity: " + ing.getStock() + " kg" +
				"and you demanded: " + quantity + " kg.");
	}
}
