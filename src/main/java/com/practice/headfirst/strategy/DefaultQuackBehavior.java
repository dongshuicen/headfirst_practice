package com.practice.headfirst.strategy;

public class DefaultQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子正常鸣叫！");
    }
}
