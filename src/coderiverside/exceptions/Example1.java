package coderiverside.exceptions;

import java.util.Objects;

public class Example1 {
    public static void main(String[] args) {
        fall(null);
    }

    static void fall(String input) {
        if (Objects.isNull(input)) {
            throw new IllegalArgumentException("Automatic Propagation. The input value should be non-null.");
        }
        System.out.println(input.toLowerCase());
    }
}
