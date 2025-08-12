package coderiverside.dsa.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println("queue = " + queue);

        System.out.println("queue.poll() = " + queue.poll());

        System.out.println("queue = " + queue);

        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("queue = " + queue);


    }
}
