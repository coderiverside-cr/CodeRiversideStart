package coderiverside.memory;

public class IntegerCache {

    public static void main(String[] args) {
        short x = 127;
        int y = 127;

        if (x == y) {
            System.out.println("x = y");
        } else {
            System.out.println( "x != y");
        }

        Integer a = 128;
        Integer b = 128;

        if (a.equals(b)) {
            System.out.println("a = b");
        } else {
            System.out.println( "a != b");
        }

        // new Integer() deprecated 9+
        Integer f = Integer.valueOf(128);
        Integer g = Integer.valueOf(128);

        if (f.equals(g)) {
            System.out.println("f = g");
        } else {
            System.out.println( "f != g");
        }
    }

}
