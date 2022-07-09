package designPattern.chap09.iter.menu;

import designPattern.chap09.iter.DinerMenuIterator;
import designPattern.chap09.iter.Iterator;

public class DinerMenu {
    private static final int MAX_ITEMS = 4;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        menuItems[numberOfItems++] = new MenuItem("TEST1", "TEST2", true, 100L);
        menuItems[numberOfItems++] = new MenuItem("TEST2", "TEST2", false, 200L);
        menuItems[numberOfItems++] = new MenuItem("TEST3", "TEST2", true, 300L);
        menuItems[numberOfItems++] = new MenuItem("TEST4", "TEST2", false, 400L);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if(numberOfItems < MAX_ITEMS) {
            menuItems[numberOfItems++] = new MenuItem(name, description, vegetarian, price);
            return;
        }

        System.out.println("NOP");
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator() {
        return new DinerMenuIterator(this.menuItems);
    }

}
