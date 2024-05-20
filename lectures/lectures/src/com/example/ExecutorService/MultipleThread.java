package com.example.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.example.multithreading.runable.PrintTask;

public class MultipleThread {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            PrintTask task = new PrintTask((char)i);
            service.submit(task);
        }
        service.shutdown();
        System.out.println("\n*******************1");

        //Wait for all task finish by executor 
        if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("\n*******************2");
            service.shutdownNow();
        }
        // PrintTask task1 = new PrintTask('*');
        // PrintTask task2 = new PrintTask('#');
        // PrintTask task3 = new PrintTask('$');

        // service.submit(task1);
        // service.submit(task2);
        // service.submit(task3);
    }


}
