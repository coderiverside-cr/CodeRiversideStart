package coderiverside.nestedclasses;
// Anonymous Inner Class example
interface Greeting {
    void sayHello();
}

public class Main4 {
    public static void main(String[] args) {
        // Anonymous Inner Class
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };

        greeting.sayHello();
    }
}
