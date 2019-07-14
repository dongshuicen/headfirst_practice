package com.practice.headfirst.factory;

public enum PizzaEnum {
    CHEESE("cheese"),
    CLAM("clam");
    String value;

    PizzaEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
