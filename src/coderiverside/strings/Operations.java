package coderiverside.strings;

public class Operations {

    public static void main(String[] args) {
        String a = " Hello ";
        a = a.trim();
        a = a.stripLeading();
        a = a.stripTrailing();

        System.out.println("a = " + a);

        String b = a.concat("World");
        System.out.println("b = " + b);

        String c = a + "World";
        System.out.println("c = " + c);

        String d = c.toLowerCase();
        System.out.println("d = " + d);

        boolean e = d.contains("W");
        System.out.println("e = " + e);

        String s = "";
        s = 1 + 1 + "u";
        System.out.println("s = " + s);

        s = "u" + 1 + 1;
        System.out.println("s = " + s);

        s = "u" + (1 + 1);
        System.out.println("s = " + s);



    }
}
