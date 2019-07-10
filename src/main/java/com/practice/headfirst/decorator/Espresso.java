package com.practice.headfirst.decorator;

public class Espresso extends Beverage{
    @Override
    protected String getDescription() {
        return "这是espresso";
    }

    @Override
    protected double cost() {
        return 4d;
    }
}
