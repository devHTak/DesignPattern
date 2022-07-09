package designPattern.chap09.iter;

import designPattern.chap09.iter.menu.MenuItem;

import java.util.Arrays;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null)
            return false;
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position++];
        return menuItem;
    }
}
