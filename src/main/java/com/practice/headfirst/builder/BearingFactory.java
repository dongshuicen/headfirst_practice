package com.practice.headfirst.builder;

import java.util.Objects;

public class BearingFactory {

    public static Person bear(ColorEnum color) {
        if (Objects.equals(ColorEnum.BLACK, color)) {
            return BlackPerson.newBuilder().build();
        } else if (Objects.equals(ColorEnum.WHITE, color)) {
            return WhitePerson.newBuilder().build();
        } else {
            return YellowPerson.newBuilder().build();
        }
    }
}
