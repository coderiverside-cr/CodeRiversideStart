package coderiverside.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorService3 {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // 1. Schedule a task to run once after 3 seconds
        scheduler.schedule(() -> {
            System.out.println("One-time task executed after 3 seconds - " + Thread.currentThread().getName());
        }, 3, TimeUnit.SECONDS);

        // 2. Schedule a task to run every 5 seconds (fixed-rate)
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Fixed-rate task runs every 5 seconds - " + Thread.currentThread().getName());
        }, 2, 5, TimeUnit.SECONDS);

        // 3. Schedule a task with a fixed delay of 4 seconds after completion
        scheduler.scheduleWithFixedDelay(() -> {
            System.out.println("Fixed-delay task runs 4 seconds after the last one finished - " + Thread.currentThread().getName());
        }, 1, 4, TimeUnit.SECONDS);

        // The scheduler will keep running indefinitely; shutdown after 20 seconds
        scheduler.schedule(() -> {
            System.out.println("Shutting down scheduler...");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);

    }
}


