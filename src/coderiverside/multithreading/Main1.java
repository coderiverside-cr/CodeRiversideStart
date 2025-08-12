package coderiverside.multithreading;

public class Main1 {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Task1 task = new Task1("Task " + i);
            Thread thread = new Thread(task);
            thread.start();
        }
        System.out.println("Main Finished");
    }
}
