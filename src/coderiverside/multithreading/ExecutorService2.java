package coderiverside.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorService2 {

    public static void main(String[] args) {
        // Step 1: Create an ExecutorService
        ExecutorService executor = Executors.newFixedThreadPool(3);
        System.out.println("Executor created and running...");

        // Step 2: Submit tasks
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Executing Task " + taskId + " on thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // Simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Step 3: Initiate shutdown
        System.out.println("Shutting down executor...");
        executor.shutdown();

        // Step 4: Wait for termination
        try {
            if (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                System.out.println("Forcing shutdown...");
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        // Step 5: Confirm termination
        if (executor.isTerminated()) {
            System.out.println("Executor has been completely shut down.");
        } else {
            System.out.println("Some tasks were not completed.");
        }

    }
}
