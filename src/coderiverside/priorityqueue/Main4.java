package coderiverside.priorityqueue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Main4 {

    public static void main(String... args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);

        PriorityQueue<Integer> pq = new PriorityQueue<>(numbers);

//        while (!pq.isEmpty()) {
//            System.out.print(pq.poll() + " ");
//        }

        Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
    }


}
