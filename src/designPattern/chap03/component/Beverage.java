package designPattern.chap03.component;

public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
