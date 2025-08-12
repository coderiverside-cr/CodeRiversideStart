package coderiverside.multithreading;

public class Livelock1 {
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
            int attempts = 0;
            while (b.isActive()) {
                System.out.println("Thread 1: Letting Thread 2 go first...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                attempts++;
                // After a few tries, break the cycle
                if (attempts > 5) {
                    System.out.println("Thread 1: Taking the turn.");
                    break;
                }
            }
            a.setActive(false);
            System.out.println("Thread 1: Proceeding. A is done.");
        });

        Thread thread2 = new Thread(() -> {
            int attempts = 0;
            while (a.isActive()) {
                System.out.println("Thread 2: Letting Thread 1 go first...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                attempts++;
                if (attempts > 5) {
                    System.out.println("Thread 2: Taking the turn.");
                    break;
                }
            }
            b.setActive(false);
            System.out.println("Thread 2: Proceeding. B is done.");
        });

        thread1.start();
        thread2.start();
    }
}
