package com.practice.headfirst.factory;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (PizzaEnum.CHEESE.value.equals(type)) {
            return new NYStyleCheesePizza();
        } else if (PizzaEnum.CLAM.value.equals(type)) {
            return new NYStyleClamPizza();
        } else return null;
    }
}
