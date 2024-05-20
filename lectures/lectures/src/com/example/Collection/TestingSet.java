package com.example.Collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Lucky"));
        System.out.println(names.add("Amit"));
        System.out.println(names.add("Gaikwad"));
        Utility.print(names);


        System.out.println(names.add("Lucky"));
        System.out.println(names.size());
        Utility.print(names);

        System.out.println(names.contains("Lucky"));
        System.out.println(names.remove("Lucky"));
        Utility.print(names);
        System.out.println(names.remove("Lucky"));



    }
}
