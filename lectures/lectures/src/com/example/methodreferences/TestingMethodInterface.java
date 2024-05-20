package com.example.methodreferences;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingMethodInterface {

    
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,6,4,6);


        numbers.stream()
            .filter(num -> num % 2 == 1)
            //Using Method References
            .forEach(System.out::println);
            //.forEach(num -> System.out.println(num));


        // int sum = 0;
        // for (Integer number : numbers) {
        //     sum += number;
        // }
        // System.out.println(sum);

        // int newSum = numbers.stream()
        // .reduce(0, new BinaryOperator<Integer>() {
        //     public Integer apply(Integer integer, Integer interger2) {
        //         return integer + interger2;
        //     }
            
        // }
        // );
        // System.out.printf("\n Sum using reduce is: %d", newSum);

        
        int newSum2 = numbers.stream()
        .reduce(0, (a,b) -> a + b );
        System.out.printf("\n Sum using reduce is: %d", newSum2);

        int newSum3 = numbers.stream()
        .reduce(0, Integer::sum );
        System.out.printf("\n Sum using Reference Method is: %d", newSum3);
    }

}
