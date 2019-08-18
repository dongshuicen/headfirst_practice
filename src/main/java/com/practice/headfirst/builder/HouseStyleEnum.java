package com.practice.headfirst.builder;

public enum HouseStyleEnum {
    CHINESE_STYLE_VILLA("C","中式洋房"),
    WESTEN_STYLE_VILLA("W", "xi式洋房");
    String value;
    String description;

    HouseStyleEnum(String value, String description) {
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
