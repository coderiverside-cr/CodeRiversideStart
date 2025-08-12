package coderiverside.multithreading;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Task task = new Task("Task " + i);
            Thread thread = new Thread(task);
            thread.start();
            thread.join();
        }
        throw new RuntimeException();
    }
}
