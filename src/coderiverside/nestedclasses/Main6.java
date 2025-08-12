package coderiverside.nestedclasses;

class OuterClass {
    // Private Static Nested Class
    private static class PrivateStaticClass {
        public void display() {
            System.out.println("Private Static Nested Class");
        }
    }

    // Private Member Inner Class
    private class PrivateInnerClass {
        //public void display() {
        private void display() {
            System.out.println("Private Member Inner Class");
        }
    }

    public void accessPrivateClasses() {
        // Accediendo a la clase estática privada
        PrivateStaticClass privateStatic = new PrivateStaticClass();
        privateStatic.display();

        // Accediendo a la clase miembro privada
        PrivateInnerClass privateInner = new PrivateInnerClass();
        privateInner.display();
    }
}

public class Main6 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessPrivateClasses();  // Solo se puede acceder dentro de la clase externa
    }
}
