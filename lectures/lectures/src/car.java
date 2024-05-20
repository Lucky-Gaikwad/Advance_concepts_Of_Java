public class car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentfuelInLiters;
    int noOfSheats;

    car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentfuelInLiters = 2;
        noOfSheats = 5;
    }

    car() {
        this("green");
        noOfWheels = 2;
    }

    public car start() {
        if (currentfuelInLiters == 0) {
            System.out.println("Car is out of fuel, can not start");
        } else if (currentfuelInLiters < 5) {
            System.out.println("Car is in reserved mode, Please refuel");
        } else {
            System.out.println("Car is started...bruhhhh....");
        }

        return this;

    }
    public void drive() {
        System.out.println("Car is driving...");
        currentfuelInLiters --;

    }

    // public void addFuel(float fuel) {
    //     currentfuelInLiters += fuel;
    // } Now we are using this in this code.
    public void addFuel(float currentfuelInLiters) {
        this.currentfuelInLiters += currentfuelInLiters; /* this code will apply
                                           only on our car object.*/
    }

    public float getCurrentFuelLevel() {
        return currentfuelInLiters;
    }
}
