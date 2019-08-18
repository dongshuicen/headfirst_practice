package com.practice.headfirst.builder;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    House house;

    @Test
    public void should_build_success_given_one_param() {
        house = House.newBuilder()
                .address("HeNan Province")
                .buildYear(LocalDate.of(2019, 8, 18))
                .cost("650000")
                .houseKeeper("Miss Liang")
                .houseStyle(HouseStyleEnum.CHINESE_STYLE_VILLA)
                .build();
        assertNotNull(house);
    }

}