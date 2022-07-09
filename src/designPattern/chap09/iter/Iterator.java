package designPattern.chap09.iter;

import designPattern.chap09.iter.menu.MenuItem;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
}
