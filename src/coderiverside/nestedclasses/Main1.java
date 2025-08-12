package coderiverside.nestedclasses;
// Member Inner class example
class OuterClass1 {
    private String outerField = "Outer Field";

    // Member Inner Class
    class InnerClass {
        void display() {
            System.out.println("Accessing outer field: " + outerField);
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        OuterClass1 outer = new OuterClass1();
        OuterClass1.InnerClass inner = outer.new InnerClass();
        //OuterClass1.InnerClass inner = new OuterClass1.InnerClass();

        inner.display();
    }
}
