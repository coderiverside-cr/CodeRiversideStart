package coderiverside.strings;

public class Initialization {

    public static void main(String[] args) {
        String a = "Hello";
        String b = a;
        String c = "Hello";

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        char[] text = {'H', 'e', 'l', 'l', 'o'};
        String d = new String(text);
        String e = new String("Hello");
        String f = d.intern();
        String g = e.intern();

        if (f == d){
            System.out.println("f = d");
        }

        if (f == g){
            System.out.println("f = g");
        }

        String asciiString = "Hello, world!"; // Cadena con caracteres ASCII (un byte por carácter)
        String unicodeString = "Привет, мир!"; // Cadena con caracteres Unicode (dos bytes por carácter)

        System.out.println(asciiString.length());
        System.out.println(asciiString.getBytes().length);

        System.out.println(unicodeString.length());
        System.out.println(unicodeString.getBytes().length);



    }
}
