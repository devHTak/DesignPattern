package designPattern.chap04.factoryMethod.factory;

import designPattern.chap04.factoryMethod.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.baking();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
