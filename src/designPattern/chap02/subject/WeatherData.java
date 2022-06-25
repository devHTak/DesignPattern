package designPattern.chap02.subject;

import designPattern.chap02.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        if(!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(o -> o.update(this.temperature, this.humidity, this.pressure));
    }

    public void measurementChanged() {
        this.notifyAllObservers();
    }

    public void setMeassurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
