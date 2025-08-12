package coderiverside.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Starvation1 {

    static class SharedResource {
        private final Lock lock = new ReentrantLock(true); // Enable fairness

        public void useResource(String threadName) {
            lock.lock();
            try {
                System.out.println(threadName + " is using the resource...");
                Thread.sleep(1000); // Simulate work
                System.out.println(threadName + " released the resource.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock(); // Always release the lock
            }
        }
    }

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // High-priority thread (no longer monopolizes)
        Thread highPriorityThread = new Thread(() -> {
            while (true) {
                sharedResource.useResource("High-Priority-Thread");
            }
        });
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        // Low-priority threads (now get fair access)
        for (int i = 1; i <= 3; i++) {
            Thread lowPriorityThread = new Thread(() -> {
                while (true) {
                    sharedResource.useResource("Low-Priority-Thread-" + Thread.currentThread().getName());
                }
            });
            lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
            lowPriorityThread.start();
        }

        highPriorityThread.start();
    }
}