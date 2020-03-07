package designpatterns;

public class PizzaFactory extends FactoryBasePizzaFactory {
	@Override
	public FactoryPizza createPizza(String type) {
		FactoryPizza pizza;
		switch(type.toLowerCase()) {
		
		case "cheese":
			pizza = new CheesePizza();
			break;
			
		case "veg":
			pizza = new VegPizza();
			break;
			
		default:
			throw new IllegalArgumentException("no such pizza");
		}
		
		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
	}
}
