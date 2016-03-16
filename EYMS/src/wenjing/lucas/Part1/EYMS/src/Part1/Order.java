package wenjing.lucas.Part1.EYMS.src.Part1;

import java.util.ArrayList;

public class Order extends Meal{
	
	public ArrayList<Meal> order;
	
	public void add_meal(Meal meal){
		this.order.add(meal);
	}
}
