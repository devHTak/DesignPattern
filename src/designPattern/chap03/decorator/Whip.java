package designPattern.chap03.decorator;

import designPattern.chap03.component.Beverage;

public class Whip extends Beverage {
    Beverage beverage;

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.4;
    }
}
