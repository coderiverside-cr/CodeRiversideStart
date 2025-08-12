package coderiverside.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SharedCounter {
    private int count = 0;

    public synchronized void increment() {
        count++; // Not synchronized (race condition)
    }

    public int getCount() {
        return count;
    }
}

public class RaceCondition1 {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submitting multiple tasks that increment the counter
        for (int i = 0; i < 10000; i++) {
            executor.submit(() -> counter.increment());
        }

        executor.shutdown();
        System.out.println("Shutdown!");
        while (!executor.isTerminated()) {
            // Wait for all tasks to finish
            System.out.println("Wait for all tasks to finish");
        }

        System.out.println("Final counter value: " + counter.getCount()); // Not necessarily 1000
    }
}
