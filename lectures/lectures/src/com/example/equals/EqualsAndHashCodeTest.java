package com.example.equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        person person1 = new person("Lucky Gaikwad", 20, "001");
        person person2 = new person("Lucky Gaikwad", 20, "001");

        if (person1.equals(person2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equal");
        }

    }
}
