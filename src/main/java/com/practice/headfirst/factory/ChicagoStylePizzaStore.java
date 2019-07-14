package com.practice.headfirst.factory;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (PizzaEnum.CHEESE.value.equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else if (PizzaEnum.CLAM.value.equals(type)) {
            return new ChicagoStyleClamPizza();
        } else return null;
    }
}
