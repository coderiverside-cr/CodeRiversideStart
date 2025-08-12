package coderiverside.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main2 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparingInt(String::length));
        queue.offer("hi!");
        queue.offer("code");
        queue.offer("riverside");

        System.out.println("Head = " + queue.peek());

        System.out.println("Poll = " + queue.poll());

        System.out.println("Head = " + queue.peek());


    }
}
