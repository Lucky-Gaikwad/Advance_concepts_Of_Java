package com.example.ExecptionAndFileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class writer {
    public static void main(String[] args) {
        String fileName = "java-course.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is the best java course.\n");
            for (int i = 0; i < 100; i++) {
                writer.write('*');
            }
            writer.flush();
            System.out.println("File written successfully");
        } catch (IOException exception) {
            System.out.printf("Exception occurred %s",
                    exception.getMessage());
        }

    }
}
