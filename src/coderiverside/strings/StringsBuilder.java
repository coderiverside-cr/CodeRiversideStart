package coderiverside.strings;

public class StringsBuilder {
    public static void main(String[] args) {
        new StringBuilder();
        new StringBuilder("Code");
        new StringBuilder(100);

        StringBuilder a = new StringBuilder();
        a.append("tea");    // a = "tea"
        a.append("s");      // a = "teas"
        a.insert(3, "m");   // a = "teams"
        a.delete(2,4);      // a = tes
        a.reverse();        // a = set
        int length = a.length();    // 3
        int capacity = a.capacity();    // 16
        System.out.println("capacity = " + capacity);
        System.out.println("a = " + a);
        a.insert(4,'s');
    }
}
