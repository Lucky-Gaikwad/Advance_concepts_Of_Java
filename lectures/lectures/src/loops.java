import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to loops Concepts...");

        //do while loop
//        System.out.print("Please enter your your age: ");
//        int age = input.nextInt();
//
//        while (age < 0 || age > 100) {
//            System.out.print("Please enter your age: ");
//            age = input.nextInt();
//        }
//        int age;
//        do {
//            System.out.print("Please enter your age: ");
//            age = input.nextInt();
//        } while (age < 0 || age >100);
//        System.out.println("Your age is: " + age);


        // for loop
//        int i = 1;
//        while (i <= 100) {
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println();
//
//        for (int j = 1; j <= 100; j++) {
//            System.out.print(j + " ");
//        }

        //foreach loop
        String[] array = new String[] {
                "Ram", "Shyam", "Rohan", "Ashish", "Lucky", "Anuj"
        };
        printArray(array);
        printArrayForEach(array);
    }

    public static void printArrayForEach (String[] array) {
        for (String name : array){
            System.out.println(name);
        }
    }
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

    }
}
