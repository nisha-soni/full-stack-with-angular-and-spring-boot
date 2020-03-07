package designpatterns;

import org.junit.Test;

public class FactoryTest {
	@Test
	 public void takePizza() {
		 FactoryBasePizzaFactory pizzafactory = new PizzaFactory();
		 FactoryPizza cheesepizza = pizzafactory.createPizza("cheese");
		 FactoryPizza vegpizza = pizzafactory.createPizza("veg");
	 }
}
