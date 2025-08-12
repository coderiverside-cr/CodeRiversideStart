package coderiverside.multithreading;

public class Livelock2 {
    static class Person {
        private final String name;
        private boolean tryingToPass;

        public Person(String name) {
            this.name = name;
            this.tryingToPass = true;
        }

        public boolean isTryingToPass() {
            return tryingToPass;
        }

        public void passDoorWith(Person person) {
            while (tryingToPass) {
                if (person.isTryingToPass()) {
                    System.out.println(name + ": You go first, " + person.name);
                    try {
                        Thread.sleep(2000); // Act of stepping aside
                    } catch (InterruptedException ignored) {
                    }
                    continue;
                }

                // If the other person isn't trying, go ahead
                System.out.println(name + ": Ok, I'm going through the door!");
                tryingToPass = false;
            }
        }
    }

    public static void main(String[] args) {
        final Person alice = new Person("Alice");
        final Person bob = new Person("Bob");

        Thread t1 = new Thread(() -> alice.passDoorWith(bob));
        Thread t2 = new Thread(() -> bob.passDoorWith(alice));

        t1.start();
        t2.start();
    }
}

