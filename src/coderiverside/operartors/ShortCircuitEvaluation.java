package coderiverside.operartors;

public class ShortCircuitEvaluation {
    public static void main(String[] args) {

        // && || Short Circuit
        // & | ^ Full Evaluation

        int a = 3, b = 2;
        boolean c = false;

        c = ( a > b && ++b == 3);   // c es true, b es 3
        System.out.println("c = " + c);

        c = ( a > b && ++b == 3);   // c es false, b es 3
        System.out.println("c = " + c);
        System.out.println("b = " + b);

        c = ( a > b || ++b == 3);   // c es false, b es 4
        System.out.println("c = " + c);

        c = ( a < b || ++b == 3);   // c es true, b es 4
        System.out.println("c = " + c);

        c = ( a < b | ++b == 3);    // c es true, b es 5
        System.out.println("c = " + c);
    }
}
