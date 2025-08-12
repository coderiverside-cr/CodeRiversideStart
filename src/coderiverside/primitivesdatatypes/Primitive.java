package coderiverside.primitivesdatatypes;

public class Primitive {
    public static void main(String[] args) {
        int a = 100;
        long b = 100L;  // long 'L'
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Integer.toBinaryString(a) = " + Integer.toBinaryString(a));
        System.out.println("Long.toOctalString(b) = " + Long.toOctalString(b));
        System.out.println("Integer.toHexString(a) = " + Integer.toHexString(a));

        char c = '\u0000';
        System.out.println("c = " + c);

        char d = '\u0020';
        System.out.println("d = " + d);

    }
    
}
