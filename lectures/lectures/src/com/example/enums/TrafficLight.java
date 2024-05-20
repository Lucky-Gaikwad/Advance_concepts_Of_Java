package com.example.enums;

public enum TrafficLight {
    RED("stop"), GREEN("Go"), YELLOW("Caution");

    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }
}
