package coderiverside.exceptions;

import java.util.Objects;

public class Example0 {
    public static void main(String[] args) {
        fall(null);
    }

    static void fall(String input) {
        if(Objects.isNull(input)){
            return;
        }
        System.out.println(input.toLowerCase());
    }
}
