package designPattern.chap04.factoryMethod.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    protected String name;
    protected String dough;
    protected String source;
    protected List<String> toppins = new ArrayList<>();

    public Pizza() {}

    public Pizza(String name, String dough, String source, List<String> toppins) {
        this.name = name; this.dough = dough; this.source = source; this.toppins = toppins;
    }

    public void prepare() { System.out.println("preparing"); }
    public void baking() { System.out.println("preparing"); }
    public void cut() { System.out.println("preparing"); }
    public void box() { System.out.println("preparing"); }
    public String getName() { return this.name; }
}
