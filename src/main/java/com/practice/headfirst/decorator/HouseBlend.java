package com.practice.headfirst.decorator;

public class HouseBlend extends Beverage{
    @Override
    protected String getDescription() {
        return "这是HouseBlend!";
    }

    @Override
    protected double cost() {
        return 2d;
    }
}
