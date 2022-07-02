package designPattern.chap04.abstractFactory.ingredientFactory;

import designPattern.chap04.abstractFactory.product.Cheese;
import designPattern.chap04.abstractFactory.product.Clams;
import designPattern.chap04.abstractFactory.product.Dough;
import designPattern.chap04.abstractFactory.product.Sauce;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClams();
}
