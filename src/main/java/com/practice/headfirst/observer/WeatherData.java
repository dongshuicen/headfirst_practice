package com.practice.headfirst.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(int observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        this.observers.stream().forEach(input -> {
            input.update(temp, humidity, pressure);
        });
    }

    public  void measurementsChanged() {
        notifyObservers();
    }

    public void changeData(float v, int i, float v1) {
        this.temp = v;
        this.humidity = i;
        this.pressure = v1;
        measurementsChanged();
    }
}
