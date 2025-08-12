package coderiverside.operartors;

public class IncrementDecrement {

    public static void main(String[] args) {
        // Operadores de Incremento y Decremento
        int a = 1, b = 0;
        a++; // incremento (a es 2)
        ++a; // incremento (a es 3)
        a--; // decremento (a es 2)
        --a; // decremento (a es 1)

        b = a++;  // incremento postfix (b es 1, a es 2)
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        b = ++a;    //incremento prefix (b es 3, a es  3)
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        b = a--;    // decremento postfix (b es 3, a es 2)
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        b = --a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

    }
}
