package designPattern.chap02.observer;

import designPattern.chap02.subject.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElment {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("tempaerature: " + temperature + ", humnidity: " + humidity + ", pressure: " + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        this.display();
    }
}