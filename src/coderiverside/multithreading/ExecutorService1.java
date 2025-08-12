package coderiverside.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorService1 {
    public static void main(String[] args) {
        Runnable printInventory =
                () -> System.out.println("Printing inventory");

        Runnable printRecords = () -> {
            for (int i = 0; i < 1000000; i++)
                System.out.println("Printing record: " + i);
        };

        ExecutorService service = Executors.newSingleThreadExecutor();

        System.out.println("begin");
        service.execute(printInventory);
        service.execute(printRecords);
        service.execute(printInventory);
        System.out.println("end");

        service.shutdown();

        try {
            if(!service.awaitTermination(1, TimeUnit.MILLISECONDS)){
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            System.out.println("e = " + e);
        }
    }
}
