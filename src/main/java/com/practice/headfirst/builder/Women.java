package com.practice.headfirst.builder;

public class Women extends Person implements Bearing {
    @Override
    public Person bear() {
        return BearingFactory.bear(ColorEnum.YELLOW);
    }
}
