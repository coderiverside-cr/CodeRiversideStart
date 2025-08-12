package coderiverside.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock1 {
    /*
    *Características principales de ReentrantLock
    ✅ Reentrancia: El mismo thread puede adquirir el lock varias veces.

    Característica	    synchronized		ReentrantLock
    Reentrante			    ✅ Sí		✅ Sí
    Fairness (justicia)		❌ No		✅ Configurable
    Interrupción			❌ No		✅ Sí
    Timeout			        ❌ No		✅ Sí
    Múltiples condiciones	❌ No		✅ Sí
    * */

    private final ReentrantLock lock = new ReentrantLock();

    public void methodA() {
        lock.lock(); // 1st acquisition of the lock
        try {
            System.out.println("Entering methodA");
            methodB(); // Calls another method that also uses the same lock
        } finally {
            lock.unlock(); // 1st release
        }
    }

    public void methodB() {
        lock.lock(); // 2nd acquisition of the lock by the SAME thread
        try {
            System.out.println("Entering methodB");
        } finally {
            lock.unlock(); // 2nd release
        }
    }

    public static void main(String[] args) {
        ReentrantLock1 demo = new ReentrantLock1();
        demo.methodA();
    }
}
