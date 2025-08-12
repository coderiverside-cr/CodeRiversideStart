package coderiverside.operartors;

public class ShiftBitwiseOperator {
    public static void main(String[] args) {
        int a = 5;     // 00000000000000000000000000000101
        int b = -5;    // 11111111111111111111111111111011
        System.out.println("Integer.toBinaryString(a) = " + Integer.toBinaryString(a));
        System.out.println("Integer.toBinaryString(b) = " + Integer.toBinaryString(b));
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = a << 2; // 000000000000000000000000000101 00        (c es 20)
        System.out.println("Integer.toBinaryString(c) = " + Integer.toBinaryString(c));
        System.out.println("c = " + c);

        int d = b << 2; // 111111111111111111111111111011 00        (c es -20)
        System.out.println("Integer.toBinaryString(d) = " + Integer.toBinaryString(d));
        System.out.println("d = " + d);

        int e = a >> 2; // 00 000000000000000000000000000001        (c es 1)
        System.out.println("Integer.toBinaryString(e) = " + Integer.toBinaryString(e));
        System.out.println("e = " + e);

        int f = b >> 2; // 11 111111111111111111111111111110        (f es -2)
        System.out.println("Integer.toBinaryString(f) = " + Integer.toBinaryString(f));
        System.out.println("f = " + f);

        int g = a >>> 2;// 00 000000000000000000000000000001       (e es 1)
        System.out.println("Integer.toBinaryString(g) = " + Integer.toBinaryString(g));
        System.out.println("g = " + g);

        int h = b >>> 2;// 00 111111111111111111111111111110       (h es 1073741822)
        System.out.println("Integer.toBinaryString(h) = " + Integer.toBinaryString(h));
        System.out.println("h = " + h);

    }
}
