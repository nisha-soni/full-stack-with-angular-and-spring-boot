package designpatterns;

public class VegPizza extends FactoryPizza {
	@Override
    public void addIngredients() {
  	  System.out.println("preparing veg pizza");
    }
}
