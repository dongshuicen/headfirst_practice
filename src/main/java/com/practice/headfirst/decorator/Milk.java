package com.practice.headfirst.decorator;

public class Milk extends CondimentDecorator{

    protected Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，加milk";
    }

    @Override
    public double cost() {
        return 0.5 + beverage.cost();
    }
}
