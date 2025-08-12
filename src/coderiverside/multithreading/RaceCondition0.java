package coderiverside.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/*
Summary Table of Atomic Classes:
Class	                Data Type	        Example Use Case
AtomicInteger	        int	                Thread-safe counters
AtomicLong	            long	            Large counters, timestamps
AtomicBoolean	        boolean	            Flags for concurrency control
AtomicReference<T>	    Object reference	Safe updates to shared objects
AtomicIntegerArray	    int[]	            Atomic array updates
AtomicLongArray	        long[]	            Atomic array of longs
AtomicReferenceArray<T>	Object array	    Atomic operations on object arrays
*/
class Shared {
    // Thread-safe counter
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); // Atomic operation (no race condition)
    }

    public int getCount() {
        return count.get();
    }
//    private int count = 0;
//
//    public void increment() {
//        count++; // Not synchronized (race condition)
//    }
//
//    public int getCount() {
//        return count;
//    }
}

public class RaceCondition0 {
    public static void main(String[] args) throws InterruptedException {
        Shared counter = new Shared();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final counter value: " + counter.getCount()); // Always 2000
    }
}
