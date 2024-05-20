package com.example.multithreading.runable;

public class PrintTask implements Runnable {
    @Override
    public void run() {

        //Print task
        for (int i = 1; i <= 24; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ", i, targetChar);
        }
        System.out.printf("\n %s %c task completed", Thread.currentThread().getName(), targetChar);
    }

    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
