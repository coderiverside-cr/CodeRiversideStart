package coderiverside.strings;

public class Example {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            s.append(i);
        }
        System.out.println("s = " + s);
    }
}
