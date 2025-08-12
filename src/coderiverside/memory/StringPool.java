package coderiverside.memory;

public class StringPool {

    public static void main(String[] args) {
        String s1 = "Code";
        String s2 = "Code";

        if (s1 == s2) {
            System.out.println("s1 = s2");
        } else {
            System.out.println( "s1 != s2");
        }

        String s3 = new String("Code");
        String s4 = new String("Code");

        if (s3.equals(s4)) {
            System.out.println("s3 = s4");
        } else {
            System.out.println( "s3 != s4");
        }
    }

}
