package coderiverside.multithreading;

public class Deadlock1 {
    static class Resource {
    }

    private final Resource r1 = new Resource();
    private final Resource r2 = new Resource();

    public void deadlock() {
        Thread t1 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("Thread1: Locked resource2");
                try {
                    Thread.sleep(100);
                } catch (Exception ignored) {
                }
                synchronized (r1) {
                    System.out.println("Thread1: Locked resource1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("Thread2: Locked resource2");
                try {
                    Thread.sleep(100);
                } catch (Exception ignored) {
                }
                synchronized (r1) {
                    System.out.println("Thread2: Locked resource1");
                }
            }
        });

        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        new Deadlock1().deadlock();
    }
}

