package com.practice.headfirst.strategy;

public class ToyDuck extends Duck{

    public ToyDuck(String name, String color, double weight, double size, QuackBehavior quackBehavior,
                   FlyBehavior flyBehavior) {
        super(name, color, weight, size, quackBehavior, flyBehavior);
    }

    public void swim() {
        System.out.printf("玩具鸭子游泳了。。");
    }

    public void quack() {
        quackBehavior.quack();
    }
}
