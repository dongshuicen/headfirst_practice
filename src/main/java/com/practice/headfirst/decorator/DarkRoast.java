package com.practice.headfirst.decorator;

public class DarkRoast extends Beverage{
    @Override
    protected String getDescription() {
        return "这是darkRoast";
    }

    @Override
    protected double cost() {
        return 3d;
    }
}
