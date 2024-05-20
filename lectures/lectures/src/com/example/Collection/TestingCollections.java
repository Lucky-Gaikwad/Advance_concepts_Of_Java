package com.example.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(4);
        numList.add(8);
        numList.add(7);
        numList.add(-45);
        Utility.print(numList);

        Collections.sort(numList);
        Utility.print(numList);

        Collections.reverse(numList);
        Utility.print(numList);

        List<Integer> unmodifiable = Collections.unmodifiableList(numList);
        //unmodifiable.add(87); // could not be changed because it is unmodified List.
    }
}
