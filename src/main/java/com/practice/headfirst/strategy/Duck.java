package com.practice.headfirst.strategy;

public abstract class Duck {

    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;
    public Duck(String name, String color, double weight, double size, QuackBehavior quackBehavior,
                FlyBehavior flyBehavior) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.size = size;
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    private String name;
    private String color;
    private double weight;
    private double size;

    public abstract void swim();

}
