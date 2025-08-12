package coderiverside.multithreading;

public class Task implements Runnable{
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.name + " = " + i);
//            if(this.name.equals("Task 3")){
//                throw new RuntimeException();
//            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
