package com.practice.headfirst.decorator;

public abstract class Beverage {

    protected String description;
    protected abstract String getDescription();
    protected abstract double cost();
}
