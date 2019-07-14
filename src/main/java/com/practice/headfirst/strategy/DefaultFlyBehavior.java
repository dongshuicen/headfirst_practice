package com.practice.headfirst.strategy;

public class DefaultFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子正常飞行");
    }
}
