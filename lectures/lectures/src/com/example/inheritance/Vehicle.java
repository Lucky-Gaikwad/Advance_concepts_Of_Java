package com.example.inheritance;

public class Vehicle {
    protected int numberOfTires;

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }
    public void commute() {
        System.out.printf("I am going form place A to B place using %d tires\n", numberOfTires);
    }
}
