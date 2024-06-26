package com.example.FilterandReduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple","banana","mango","cherry","date");
        System.out.println(fruits.size());
        System.out.println("Printing Fruits normally");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();
        System.out.println("Printing Fruits using streams");

        fruits.stream().forEach(new Consumer<String>() {
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        System.out.println();
        System.out.println("Printing Fruits using Lambda");
        fruits.stream()
        .filter(fruit -> fruit.endsWith("e")) // filter property
        .forEach(fruit -> System.out.println(fruit));
    }
}
