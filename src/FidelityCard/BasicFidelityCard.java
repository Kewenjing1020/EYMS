package FidelityCard;

import Restaurant.Meal;

public class BasicFidelityCard extends FidelityCardVisitor{


	/**
	 * 
	 */
	private static final long serialVersionUID = -8902126880317952851L;

	@Override
	public String toString() {
		return "BasicFidelityCard";
	}

	@Override
	public Double getPriceVisit(Meal meal) {
		return meal.getPrice();
	}
	
	
	

}
