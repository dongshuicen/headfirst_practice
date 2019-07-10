package com.practice.headfirst.decorator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MochaTest {

    private Mocha mocha;
    @BeforeAll
    public void setUp() {
        Beverage beverage = new DarkRoast();
        mocha = new Mocha(beverage);
    }

    @Test
    public void should_return_true_given_mocha() {
        assertTrue(mocha.cost() == 3.6d);
    }
}