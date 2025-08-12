package coderiverside.nestedclasses;
//  Static Nested Class example
class OuterClass2 {
    private static String staticOuterField = "Static Outer Field";

    // Static Nested Class
    static class StaticNestedClass {
        void display() {
            System.out.println("Accessing static outer field: "
                    + staticOuterField);
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Static Nested Class instance
        OuterClass2.StaticNestedClass nested = new OuterClass2.StaticNestedClass();
        nested.display();
    }
}
