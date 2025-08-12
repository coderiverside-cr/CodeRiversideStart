package coderiverside.operartors;

public class BitwiseOperator {
    public static void main(String[] args) {
//        int a = 2;
//        int b = ~a;
//        System.out.println("b = " + b);
//        System.out.println("Integer.toBinaryString(a) = " + Integer.toBinaryString(a));
//        System.out.println("Integer.toBinaryString(b) = " + Integer.toBinaryString(b));

        byte a = 5;                 // 00000101
        byte b = 3;                 // 00000011
        byte c = (byte) (a & b);    // 00000001  c es 1
        byte d = (byte) (a | b);    // 00000111  d es 7
        byte e = (byte) (a ^ b);    // 00000110  e es 6
    }
}
