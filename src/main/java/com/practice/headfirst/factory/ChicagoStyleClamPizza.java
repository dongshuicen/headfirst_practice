package com.practice.headfirst.factory;

import java.util.Arrays;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "芝加哥风味蛤蜊披萨";
        dough = "高粱面";
        sauce = "花甲";
        toppings.addAll(Arrays.asList(new String[]{"大蒜", "生姜"}));
    }
}
