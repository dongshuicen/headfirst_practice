package com.practice.headfirst.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;//名称
    String dough;//面团
    String sauce;//酱料
    List<String> toppings = new ArrayList<>();
    void prepare() {
        System.out.println("Preparing "+ name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        toppings.stream().forEach((input) -> System.out.println(input));
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }
}
