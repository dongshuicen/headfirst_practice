package com.practice.headfirst;

public abstract class Duck {

    private String name;
    private String color;
    private double weight;
    private double size;

    private void swim() {
        System.out.println(" 游泳了  ");
    }

    private void quack() {
        System.out.println("呱呱，会叫了");
    }
}
