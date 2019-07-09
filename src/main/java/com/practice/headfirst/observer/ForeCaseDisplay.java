package com.practice.headfirst.observer;

public class ForeCaseDisplay implements DisplayElement, Observer{

    private float temp;
    private float humidity;

    @Override
    public void display() {
        System.out.println("天气预报，温度："+ temp + "; 当前湿度："+ humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
