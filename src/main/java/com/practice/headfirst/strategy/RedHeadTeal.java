package com.practice.headfirst.strategy;

public class RedHeadTeal extends Duck{

    public RedHeadTeal(String name, String color, double weight, double size, QuackBehavior quackBehavior,
                       FlyBehavior flyBehavior) {
        super(name, color, weight, size, quackBehavior, flyBehavior);
    }

    @Override
    public void swim() {
        System.out.printf("红头鸭子游泳了。。");
    }

    public void quack() {
        quackBehavior.quack();
    }
}
