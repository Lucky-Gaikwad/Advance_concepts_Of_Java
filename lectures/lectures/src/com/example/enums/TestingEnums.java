package com.example.enums;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;
        //Cannot defined color = TrafficLight.BLACK;
        System.out.println(color);

        Grade grade = Grade.valueOf("A");//enum conversion
        for (Grade value : Grade.values()) {
            System.out.println(value);
        }

    }


}
