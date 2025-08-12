package coderiverside.exceptions;

public class Example6Flow {

    public static void main(String... args) {
        Integer a = 25;
        Integer b = 0;
        Integer c = divide(a, b); // Interrupted
        System.out.println("c = " + c);
    }

    public static int divide(int a, int b) {
        int c = a / b; // Interrupted
        return c;
    }
}
