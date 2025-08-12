package coderiverside.nestedclasses;
// Local Inner Class example
class OuterClass3 {
    void display() {
        String localVar = "Local Variable";
        // Local Inner Class
        class LocalInnerClass {
            void print() {
                //localVar = "Hello";
                System.out.println("Accessing local variable: " + localVar);
            }
        }
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.print();
    }
}
public class Main3 {
    public static void main(String[] args) {
        OuterClass3 outer = new OuterClass3();
        outer.display();
    }
}

