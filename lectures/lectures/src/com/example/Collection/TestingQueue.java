package com.example.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // (add and offer)
        queue.add(1);
        queue.offer(2);
        Utility.print(queue);

        //(peek and element)
        System.out.println(queue.peek());
        System.out.println(queue.element());

        //(remove and poll)
        System.out.println(queue.remove());
        Utility.print(queue);
        System.out.println(queue.poll());
        Utility.print(queue);

        System.out.println(queue.poll());


    }
}
