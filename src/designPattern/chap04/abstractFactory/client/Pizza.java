package designPattern.chap04.abstractFactory.client;

import designPattern.chap04.abstractFactory.product.Cheese;
import designPattern.chap04.abstractFactory.product.Clams;
import designPattern.chap04.abstractFactory.product.Dough;
import designPattern.chap04.abstractFactory.product.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Clams clams;
    Cheese cheese;

    public abstract void prepare();
    public void baking() { System.out.println("preparing"); }
    public void cut() { System.out.println("preparing"); }
    public void box() { System.out.println("preparing"); }
    public String getName() { return this.name; }
}
