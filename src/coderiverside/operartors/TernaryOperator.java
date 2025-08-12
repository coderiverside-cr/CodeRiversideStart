package coderiverside.operartors;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 2, b = 3;
        int c = (a > b) ? a : b;  // c es 3
        System.out.println("c = " + c);

        c = (a < b) ? a : b;    // c es 2
        System.out.println("c = " + c);

    }
}
