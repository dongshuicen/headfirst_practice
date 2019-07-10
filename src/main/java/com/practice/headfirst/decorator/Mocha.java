package com.practice.headfirst.decorator;

public class Mocha extends CondimentDecorator{

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    protected double cost() {
        return 0.6 + this.beverage.cost();
    }
}
