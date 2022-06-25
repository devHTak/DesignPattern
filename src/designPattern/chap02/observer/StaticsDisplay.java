package designPattern.chap02.observer;

import designPattern.chap02.subject.WeatherData;

public class StaticsDisplay implements Observer, DisplayElment {

    private float temperature;
    private float pressure;
    private WeatherData weatherData;

    public StaticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("tempaerature: " + temperature + ", pressure: " + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;

        this.display();
    }
}
