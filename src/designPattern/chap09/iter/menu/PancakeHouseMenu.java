package designPattern.chap09.iter.menu;

import designPattern.chap09.iter.Iterator;
import designPattern.chap09.iter.PancakeHouseIterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("TEST1", "TEST1", true, 100L));
        menuItems.add(new MenuItem("TEST2", "TEST2", false, 200L));
        menuItems.add(new MenuItem("TEST3", "TEST3", true, 300L));
        menuItems.add(new MenuItem("TEST4", "TEST4", false, 400L));
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

//    public List<MenuItem> getMenuItems() {
//        return this.menuItems;
//    }
    public Iterator createIterator() {
        return new PancakeHouseIterator(this.menuItems);
    }
}
