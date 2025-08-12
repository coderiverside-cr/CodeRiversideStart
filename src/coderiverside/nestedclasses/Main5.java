package coderiverside.nestedclasses;

class OuterClass5 {
    // Public Static Nested Class
    public static class PublicStaticClass {
        public void display() {
            System.out.println("Public Static Nested Class");
        }
    }

    // Protected Member Inner Class
    protected class ProtectedInnerClass {
        public void display() {
            System.out.println("Protected Member Inner Class");
        }
    }

    // Default Static Nested Class
    static class DefaultStaticClass {
        public void display() {
            System.out.println("Default Static Nested Class");
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
        // Public Static Nested Class
        OuterClass5.PublicStaticClass publicStatic = new OuterClass5.PublicStaticClass();
        publicStatic.display();

        // Protected Member Inner Class
        OuterClass5 outer = new OuterClass5();
        OuterClass5.ProtectedInnerClass protectedInner = outer.new ProtectedInnerClass();
        protectedInner.display();

        // Default Static Nested Class
        OuterClass5.DefaultStaticClass defaultStatic = new OuterClass5.DefaultStaticClass();
        defaultStatic.display();

    }
}
