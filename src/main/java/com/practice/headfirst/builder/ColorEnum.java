package com.practice.headfirst.builder;

public enum ColorEnum {

    WHITE("W", "白种人"),
    YELLOW("Y", "黄种人"),
    BLACK("B", "黑种人");
    String value;
    String description;

    ColorEnum(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
