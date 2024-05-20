public class Driver {
	static int minAgeForDriving = 18;

	String name;

	int age;

	String dateOfLicense;


	public boolean isAllowedToDrive() {
		return this.age >= minAgeForDriving;
	}

	public static void main (String[] args) {
		// car myCar = new car();
		// myCar.addFuel(6);
		// myCar.drive();
		// myCar.drive();
		// myCar.drive();
		// myCar.addFuel(3);
		// myCar.drive();
		// System.out.println(myCar.getCurrentFuelLevel());

		car swift = new car();
		// swift.addFuel(6);
		swift.start().drive();
		System.out.println(swift.color);
		System.out.println(swift.noOfWheels);

		// Driver myDriver = new Driver();
		// myDriver.dateOfLicense = "1/jan/2024";
		// System.out.println(minAgeForDriving);
		
	}
}