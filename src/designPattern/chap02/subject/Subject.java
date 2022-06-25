package designPattern.chap02.subject;

import designPattern.chap02.observer.Observer;

public interface Subject {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyAllObservers();

}
