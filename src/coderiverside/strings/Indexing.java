package coderiverside.strings;

public class Indexing {
    public static void main(String[] args) {
        String a = "HelloWorld";
        String b = a.substring(0,5); // b es "Hello"
        int c = a.indexOf('o');      // c es 4
        int d = a.indexOf('o', 5); // d es 6
        int e = a.lastIndexOf('l'); // e es 8
        int f = a.indexOf('a'); // f es -1
        char g = a.charAt(0);   // g es H
        int h = a.length();     // h es 10
        char i = a.charAt(10);
    }
}
