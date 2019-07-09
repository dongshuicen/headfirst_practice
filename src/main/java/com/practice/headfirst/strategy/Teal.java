package com.practice.headfirst.strategy;

public class Teal extends Duck{

    public Teal(String name, String color, double weight, double size, QuackBehavior quackBehavior,
                FlyBehavior flyBehavior) {
        super(name, color, weight, size, quackBehavior, flyBehavior);
    }

    public void swim() {
        System.out.printf("小旱鸭子游泳了。。");
    }

    public void quack() {
        quackBehavior.quack();
    }
}
