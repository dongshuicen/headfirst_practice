package com.practice.headfirst.factory;

public class SimplePizzaFactory {
    public Pizza orderPizza(String type) {

        Pizza pizza ;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("ny_cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        }else {
            return null;
        }

        return pizza;
    }
}
