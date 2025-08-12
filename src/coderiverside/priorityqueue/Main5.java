package coderiverside.priorityqueue;

import java.util.PriorityQueue;

public class Main5 {

    public static void main(String... args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(10);

        // Agregamos algunos elementos
        pq.add(5);
        pq.add(3);
        pq.add(8);
        pq.add(1);
        pq.add(2);

        System.out.println("pq.size() = " + pq.size());
        // Mostramos los elementos de la PriorityQueue
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }

    }


}
