package coderiverside.priorityqueue;

import java.util.PriorityQueue;

public class Main1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(2);
        queue.offer(5);
        queue.offer(1);

        System.out.println("Head = " + queue.peek());
        System.out.println("Size = " + queue.size());

        System.out.println("Poll = " + queue.poll());
        System.out.println("Size = " + queue.size());

        System.out.println("Head = " + queue.peek());
        System.out.println("Size = " + queue.size());

    }

}
