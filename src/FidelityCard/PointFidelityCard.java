package FidelityCard;

import Restaurant.Meal;

public class PointFidelityCard extends FidelityCardVisitor{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int point;

	@Override
	public String toString() {
		return "PointFidelityCard [point=" + point + "]";
	}

	@Override
	public Double getPriceVisit(Meal meal) {
		Double price = meal.getPrice();
		if (this.point >= 100)
			price *= 0.9;
		return price;
	}
}
