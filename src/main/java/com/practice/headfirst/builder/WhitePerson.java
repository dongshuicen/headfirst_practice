package com.practice.headfirst.builder;

import java.math.BigDecimal;

public class WhitePerson extends Person{


    private WhitePerson(Builder builder) {
        name = builder.name;
        age = builder.age;
        national = builder.national;
        weight = builder.weight;
        height = builder.height;
        college = builder.college;
        color = ColorEnum.WHITE;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String name;
        private int age;
        private String national;
        private BigDecimal weight;
        private BigDecimal height;
        private String college;
        private ColorEnum color;

        private Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder national(String val) {
            national = val;
            return this;
        }

        public Builder weight(BigDecimal val) {
            weight = val;
            return this;
        }

        public Builder height(BigDecimal val) {
            height = val;
            return this;
        }

        public Builder college(String val) {
            college = val;
            return this;
        }

        public WhitePerson build() {
            return new WhitePerson(this);
        }
    }
}
