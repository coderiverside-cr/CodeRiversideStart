package coderiverside.multithreading;

public class Livelock0 {
    static class Task {
        private volatile boolean active;

        public Task() {
            active = true;
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }
    }

    public static void main(String[] args) {
        Task a = new Task();
        Task b = new Task();

        Thread thread1 = new Thread(() -> {
            // do A Actions
            while (b.isActive()) {
                System.out.println("Thread 1: Letting Thread 2 go first...");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            }
            a.setActive(false);
            System.out.println("Thread 1: Proceeding. A is done.");
        });

        Thread thread2 = new Thread(() -> {
            // do B Actions
            System.out.println("Thread 2: Working...");
            try { Thread.sleep(200); } catch (InterruptedException ignored) {}
            b.setActive(false);
            System.out.println("Thread 2: Proceeding. B is done.");
        });

        thread1.start();
        thread2.start();
    }
}
