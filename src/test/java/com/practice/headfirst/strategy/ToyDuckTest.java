package com.practice.headfirst.strategy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ToyDuckTest {

    private ToyDuck toyDuck;
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    @BeforeAll
    public void setUp() {
        quackBehavior = new DefaultQuackBehavior();
        flyBehavior = new DefaultFlyBehavior();
        toyDuck = new ToyDuck("小黑1","红色",20d,1.5d,quackBehavior,flyBehavior);
    }
    @Test
    void swim() {
        toyDuck.swim();
    }

    @Test
    void quack() {
        toyDuck.quack();
    }
}