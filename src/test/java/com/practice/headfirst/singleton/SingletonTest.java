package com.practice.headfirst.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SingletonTest {

    private Singleton singleton;
    @BeforeAll
    public void setUp() {
        singleton = Singleton.getInstance();
    }

    @Test
    public void should_retun_same_instance_when_get_instance() {

        Singleton other = Singleton.getInstance();
        assertTrue(singleton.equals(other));
    }
}