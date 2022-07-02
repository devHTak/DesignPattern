package designPattern.chap04.abstractFactory.client;

import designPattern.chap04.abstractFactory.ingredientFactory.NyPizzaIngredientPizzaFactory;
import designPattern.chap04.abstractFactory.ingredientFactory.PizzaIngredientFactory;

public class ConcretePizzaStore implements PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NyPizzaIngredientPizzaFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        }

        return pizza;
    }
}
