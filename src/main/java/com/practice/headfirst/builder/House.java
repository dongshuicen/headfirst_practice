package com.practice.headfirst.builder;

import java.time.LocalDate;

public class House {

    private String address;
    private String name;
    private HouseStyleEnum houseStyle;
    private String cost;
    private int rooms;
    private String houseKeeper;

    private String idNo;
    private LocalDate buildYear;

    private House(Builder builder) {
        address = builder.address;
        name = builder.name;
        houseStyle = builder.houseStyle;
        cost = builder.cost;
        rooms = builder.rooms;
        houseKeeper = builder.houseKeeper;
        idNo = builder.idNo;
        buildYear = builder.buildYear;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String address;
        private String name;
        private HouseStyleEnum houseStyle;
        private String cost;
        private int rooms;
        private String houseKeeper;
        private String idNo;
        private LocalDate buildYear;

        private Builder() {
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder houseStyle(HouseStyleEnum val) {
            houseStyle = val;
            return this;
        }

        public Builder cost(String val) {
            cost = val;
            return this;
        }

        public Builder rooms(int val) {
            rooms = val;
            return this;
        }

        public Builder houseKeeper(String val) {
            houseKeeper = val;
            return this;
        }

        public Builder idNo(String val) {
            idNo = val;
            return this;
        }

        public Builder buildYear(LocalDate val) {
            buildYear = val;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
