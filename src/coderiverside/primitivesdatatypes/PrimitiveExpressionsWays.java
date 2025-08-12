package coderiverside.primitivesdatatypes;

public class PrimitiveExpressionsWays {
    public static void main(String[] args) {
        System.out.println();
        int binary = 0b1001;  // binary '0b'
        int octal = 074;  // octal '0'
        int decimal = 25;
        int hexadecimal = 0xFA; // hexadecimal '0x'

        System.out.println("binary = " + binary);
        System.out.println("octal = " + octal);
        System.out.println("decimal = " + decimal);
        System.out.println("hexadecimal = " + hexadecimal);

        System.out.println();

        float normal = 17.25F;
        double exponencial = 17.25E-2;

        System.out.println("normal = " + normal);
        System.out.println("exponencial = " + exponencial);

        System.out.println();

        char a = 'A';
        char d = 65;    // decimal
        char ascii = '\101';
        char unicode = '\u0041';
        char tab = '\t';
        char backspace = '\b';
        char newline = '\n';
        char carriagereturn = '\r';
        char formfeed = '\f';
        char singlequote = '\'';
        char doubleequote = '\"';
        char backslash = '\\';

        System.out.println("d = " + d);
        System.out.println("a = " + a);
        System.out.println("ascii = " + ascii);
        System.out.println("unicode = " + unicode);
        System.out.println("tab = " + tab);
        System.out.println("backspace = " + backspace);
        System.out.println("newline = " + newline);
        System.out.println("carriagereturn = " + carriagereturn);
        System.out.println("formfeed = " + formfeed);
        System.out.println("doubleequote = " + doubleequote);
        System.out.println("singlequote = " + singlequote);
        System.out.println("backslash = " + backslash);

        System.out.println();

        int value = 10;
        long promotion = value;
        //value = promotion;

        float f = 10.5F;
        double u = f;
        //f = u;



    }

}
