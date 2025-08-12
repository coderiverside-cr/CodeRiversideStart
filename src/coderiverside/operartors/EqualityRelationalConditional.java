package coderiverside.operartors;

public class EqualityRelationalConditional {

    public static void main(String[] args) {
        // Igual ==
        // Distinto (No igual) !=
        // Mayor que >
        // Mayor o igual que >=
        // Menor que <
        // Menor o igual que <=
        // No !
        // AND && &
        // OR || |
        // OR Exclusivo ^

        int a = 3, b = 2;
        boolean c = false;

        c = (a == b); // c es false
        c = !(a == b); // c es true
        c = (a != b); // c es true
        c = (a > b); // c es true
        c = (a >= b); // c es true
        c = (a < b); // c es false
        c = (a <= b); // c es false
        c = (a > b && b == 2); // c es true
        c = (a < b && b == 2); // c es false
        c = (a < b || b == 2); // c es true
        c = (a < b || b == 3); // c es false
        c = (a > b ^ b == 2); // c es false
    }
}
