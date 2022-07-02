package designPattern.chap04.factoryMethod.factory;

import designPattern.chap04.factoryMethod.pizza.ChicagoStyleCheesePizza;
import designPattern.chap04.factoryMethod.pizza.Pizza;

import java.util.ArrayList;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if("cheese".equals(type))
            return new ChicagoStyleCheesePizza();

        return new Pizza("Simple", "SimpleDough", "SimpleSource", new ArrayList<>());
    }
}
