package com.practice.headfirst.factory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class NYStylePizzaStoreTest {

    private PizzaStore pizzaStore;

    @BeforeAll
    public void setUp() {
        pizzaStore = new NYStylePizzaStore();
    }
    @Test
    void should_return_nystyle_cheese_given_cheese() {
        Pizza pizza = pizzaStore.orderPizza("cheese");
        assertTrue(NYStyleCheesePizza.class.isInstance(pizza));
    }
}