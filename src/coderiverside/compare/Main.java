package coderiverside.compare;

public class Main {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(4);
        Integer b = 4;

        System.out.println("a.compareTo(b) = " + a.compareTo(b));

        String s1 = "zero";
        String s2 = "uno";

        System.out.println("s1.compareTo(s2) = " + s1.compareTo(s2));

        Integer i = 0;
        String s = "one";

        //i.compareTo(s);  // Compilation Error

        Number n1 = 1;
        Number n2 = Double.valueOf(Math.PI);

        //n1.compareTo(n2);

        Integer f = 17;
        //f.compareTo(null);

        Integer x = 25;
        Integer y = 17;

        System.out.println("x < y => " + (x.compareTo(y) < 0));
        System.out.println("x <= y => " + (x.compareTo(y) <= 0));

    }
}
