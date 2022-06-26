package designPattern.chap03.decorator;

import designPattern.chap03.component.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;
    public abstract String getDescription();

}
