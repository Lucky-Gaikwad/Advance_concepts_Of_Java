package com.example.Polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();

        Vehicle v = new Vehicle();
        Plane p = new Plane();

        //castTest(v);
        castTest(c);
        //castTest(p);


        //Vehicle vCar = new Car();// This is upcasting

        //Car cVehicle = new Vehicle(); (error) This is downcast// Because vehicle is not a child of Car.
        // There is the reference is of Car but object is of Vehicle so that there is not possible of creating
        // an object of car with reference of Vehicle. But this is possible by casting split
        //Car cVehicle = (Car) new Vehicle();

        Object ref = new Vehicle(); // It is possible because Object is the parent of all classes in the java.
    }

    private static void castTest (Vehicle veh) {
        Car cVehicle = (Car) veh;
        cVehicle.start();
        veh.start();
        //veh.noOfDoors(); Because noOfDoors is the method of Car. so we can not call this method directly.
        // We have to take reference of car that is cVehicle. Because Vehicle has not noOfDoors.
        //cVehicle.noOfDoors();
        System.out.println(cVehicle.noOfDoors());

    }
}











