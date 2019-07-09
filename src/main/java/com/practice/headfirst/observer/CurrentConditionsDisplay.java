package com.practice.headfirst.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private Subject subject;

    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("当前温度："+ temp + "; 当前湿度："+ humidity + "; 当前压强：" + pressure);

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
