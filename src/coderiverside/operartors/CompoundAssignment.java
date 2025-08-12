package coderiverside.operartors;

public class CompoundAssignment {

    public static void main(String[] args) {
        // Asignacion Compuesta
        int a = 1, b = 3;
        a += b; // equivalente de a = a + b (a es 4)
        a -= 2; // equivalente de a = a - 2 (a es 2)
        a *= b; // equivalente de a = a * b (a es 6)
        a /= 2; // equivalente de a = a / 2 (a es 3)
        a %= a; // equivalente de a = a % a (a es 0)
    }
}
