package designpatterns;

public class CheesePizza extends FactoryPizza {
	@Override
      public void addIngredients() {
    	  System.out.println("preparing chesse pizza");
      }
}
