package com.example.StreamMethods;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethod {

    public static void main(String[] args) {
        List <Integer> numbers = List.of(2,3,4,5,3,4,5,5);
        Optional<Integer> maxNumber = numbers.stream()
        .max(Integer::compareTo);
        // output: 5 (max number)
        maxNumber.ifPresent(System.out::println);

        Optional<Integer> minNumber = numbers.stream()
        .min(Integer::compareTo);
        // output: 2 (min number)
        minNumber.ifPresent(System.out::println);

        List<Integer> collectNumber = numbers.stream()
        .collect(Collectors.toList());
        // output: [2,3,4,5,3,4,5,5]
        System.out.println(collectNumber);

        List<Integer> sortedNumber = numbers.stream()
        .sorted()
        .collect(Collectors.toList());
        System.out.println(sortedNumber);

        // No duplicate items repeat
        List <Integer> distinctItems = numbers.stream()
        .distinct()
        .collect(Collectors.toList());
        System.out.println(distinctItems);

        // In map the no of items will be same but in filter no of items can be changed
        List<String> words = List.of("apple", "Mango", "Bnana", "Orange", "apple", "Mango");
        List<String> uppercaseWords = words.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println(uppercaseWords);


    }
}
