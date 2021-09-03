package com.session.august28.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestRunQueue {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>(25);
        queue.add("Surinder");
        queue.add("Ajay");
        queue.add("Surinder");
        queue.add("Shubham");

        System.out.println(queue);

        System.out.println(queue.remove());
        // System.out.println(queue.offer());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());

    }
}
