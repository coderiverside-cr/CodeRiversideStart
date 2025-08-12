package coderiverside.operartors;

public class ArithmeticOperationsAndTypeCasting {
    public static void main(String[] args) {
        // Tipos de datos mas pequeños  son automaticamente casted (promocion) a tipos mas grandes.
        // byte -> short -> char -> int -> long -> float -> double
        // Un tipo de dato mas grande no puede ser asignado a una variable con tipo de dato mas pequeño
        // sin usar casting explicito.
        // Cuando aplicamos casting de un valor mas grande a uno mas pequeño, puede generar Overflow
        // El tipo de dato resultante de una operacion aritmetica de tipos de datos mas pequeños que int
        // es un int, en otro caso el resultado es del tipo del mas grande participante en la operacion

        byte a = 127, b = 5;

        //byte c = a + b;

        int d = a + b;  // d es 132

        byte e = (byte) (a + b); // e es -124 (type overflow, porque 127 es el maximo valor para byte)
        System.out.println("e = " + e);

        int f = a / b;  // f es 25 porque a / b  es un int
        System.out.println("f = " + f);

        float g = a / b;    // g es 25.0F porque a / b  es un int y es implicitamente cast a float
        System.out.println("g = " + g);

        float h = (float) (a / b);  // h es 25.0F porque a / b  es un int y es explicitamente casted a float
        System.out.println("h = " + h);

        float i = (float)a / b;     // i es 25.4F porque ahora el mas grande tipo es float (a)
        System.out.println("i = " + i);

        float j = a / (float) b;    // i es 25.4F porque ahora el mas grande tipo es float (b)
        System.out.println("j = " + j);

        b = (byte) (b + 1);     // Casting explicito es requerido, porque b + 1 es int

        byte z = b++;   // No es requerido casting para operadores ++ y --

        char x = 'x';
        char y = ++x;   // Los operadores aritmeticos trabajan con codigos caracter
        System.out.println("y = " + y);
    }
}
