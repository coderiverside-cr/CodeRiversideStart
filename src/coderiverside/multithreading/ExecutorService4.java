package coderiverside.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorService4 {
    public static void main(String[] unused) throws Exception {
        try (var service = Executors.newSingleThreadExecutor()) {
            Future<Integer> result = service.submit(() -> 30 + 11);
            System.out.println(result.get());   // 41
        }
    }
}
