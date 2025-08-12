package coderiverside.multithreading;

import java.util.concurrent.*;

public class ExecutorService5 {

        public static void main(String[] args) {

            Callable<String> callable = () -> {
                Thread.sleep(10000); // Simulate work
                return "Result from Callable on thread: " + Thread.currentThread().getName();
            };

            ExecutorService executor = Executors.newSingleThreadExecutor();

            Future<String> future = executor.submit(callable);

            try {
                System.out.println("Waiting for result...");
                System.out.println("Callable Result: " + future.get()); // Blocking call
//                System.out.println("Callable Result: " + future.get(5, TimeUnit.SECONDS)); // Blocking call
            } catch (InterruptedException e) {
                System.out.println("InterruptedException = " + e);
            } catch (ExecutionException e) {
                System.out.println("ExecutionException = " + e);
            } /*catch (TimeoutException e) {
                System.out.println("TimeoutException = " + e);
            }*/

            executor.shutdown();
        }
    }

