package com.example.nested;

public class Car { // apply only public and default (class)
    private int noOfDoors;
    public void repair() {
        tyre t = new tyre();
    }
    protected class tyre { // all access modifier applied
        private double width;
        private double pressure;
        private String material;
        public void inflate() {
            noOfDoors = 4;
        }

    }
}
