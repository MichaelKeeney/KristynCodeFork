package edu.mu;

import edu.mu.Cooking.CookingStyleType;
import edu.mu.Order.PizzaOrder;
import edu.mu.pizzaTypes.MargheritaPizza;
import edu.mu.pizzaTypes.PizzaType;

public class Main {

	public static void main(String[] args) {
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		PizzaOrder order = new PizzaOrder();
		
		
		
		// Adds pizzas to the cart, selects cooking strategies for the pizzas in the cart,
		//prints pizza order cart. Calls checkout to calculate the bill, 
		//throws exception if triggered.
		order.addPizzaToCart(PizzaType.MARGHERITA);
		order.addPizzaToCart(PizzaType.SUPREME);
		
		order.selectCookingStrategyByPizzaOrderID(1, CookingStyleType.BRICK_OVEN);
		order.selectCookingStrategyByPizzaOrderID(2, CookingStyleType.CONVENTIONAL_OVEN);
		
		order.printPizzaOrderCart(1);
		order.printPizzaOrderCart(2);
	}

}
