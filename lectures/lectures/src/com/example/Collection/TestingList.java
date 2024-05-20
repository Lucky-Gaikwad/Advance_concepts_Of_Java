package com.example.Collection;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();

        strList.add("Lucky");
        strList.add("Gaikwad");
        //strList.add(54);

        strList.add(1,"Amit");
        strList.remove(0);

        if (strList.contains("Amit")) {
            System.out.println(strList.indexOf("Gaikwad"));
        }

        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        for (String str : strList) {
            System.out.println(str);
        }

    }
}
