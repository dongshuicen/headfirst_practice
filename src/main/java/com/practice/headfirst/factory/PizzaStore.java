package com.practice.headfirst.factory;

/*工厂方法*/
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
