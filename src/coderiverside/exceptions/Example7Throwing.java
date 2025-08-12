package coderiverside.exceptions;

public class Example7Throwing {

    public static void main(String... args) {
        Integer a = 25;
        Integer b = 0;
        Integer c = divide(a, b);
        System.out.println("c = " + c);
    }

    public static int divide(int a, int b) {
        if(b == 0){
            throw new ArithmeticException("Error. a: " + a + " b: " + b);
        }
        int c = a / b;
        return c;
    }
}
