package com.example.multithreading;

public class NeedMultiThreading {
    public static void main(String[] args) {

        long startingTime = System.currentTimeMillis();

        //First task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n * task completed");

        //Second task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n $ task completed");

        //Third task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d@ ", i);
        }
        System.out.println("\n @ task completed");

        long endingTime = System.currentTimeMillis();
        System.out.printf("Total time taken: %d", (endingTime - startingTime));
    }
}
