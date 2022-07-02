package designPattern.chap04.factoryMethod.factory;

import designPattern.chap04.factoryMethod.pizza.NYStyleCheesePizza;
import designPattern.chap04.factoryMethod.pizza.Pizza;

import java.util.ArrayList;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if("cheese".equals(type))
            return new NYStyleCheesePizza();

        return new Pizza("Simple", "SimpleDough", "SimpleSource", new ArrayList<>());
    }
}
