package coderiverside.multithreading;

public class Starvation0 {

    // Shared resource
    static class SharedResource {
        public synchronized void useResource(String threadName) {
            System.out.println(threadName + " is using the resource...");
            try {
                Thread.sleep(1000); // Simulates work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " released the resource.");
        }
    }

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // High priority thread (monopolizes the resource)
        Thread highPriorityThread = new Thread(() -> {
            while (true) {
                sharedResource.useResource("High-Priority-Thread");
            }
        });
        //highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        // Low priority threads (may suffer starvation)
        for (int i = 1; i <= 3; i++) {
            Thread lowPriorityThread = new Thread(() -> {
                while (true) {
                    sharedResource.useResource("Low-Priority-Thread-" + Thread.currentThread().getName());
                }
            });
            //lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
            lowPriorityThread.start();
        }

        highPriorityThread.start();
    }
}