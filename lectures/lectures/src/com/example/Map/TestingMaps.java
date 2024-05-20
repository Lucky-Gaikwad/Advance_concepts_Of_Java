package com.example.Map;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Lucky", 7);
        map.put("Anuj", 4);
        map.put("Ashish", 5);
        map.put("Sunny", 6);
        map.put("Asshole", 10);
        map.put("Ganpati", 3);

        System.out.println(map.size());
        System.out.println(map.get("Lucky"));
        System.out.println(map.containsKey("Sunny"));
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.remove("Asshole"));
        System.out.println(map.size());


        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));

        }
    }
}
