package FidelityCard;

import Restaurant.Meal;

public class LotteryFidelityCard extends FidelityCardVisitor{


	/**
	 * 
	 */
	private static final long serialVersionUID = -152178044169108710L;

	@Override
	public String toString() {
		return "LotteryFidelityCard";
	}
	
	@Override
	public Double getPriceVisit(Meal meal) {
		return meal.getPrice();
	}
}
