package designpatterns;

public abstract class FactoryPizza {
   public abstract void addIngredients() ;
   public void bakePizza() {
	   System.out.println("Baking Pizzaa");
   }
}
