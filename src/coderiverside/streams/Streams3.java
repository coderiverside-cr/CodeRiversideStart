package coderiverside.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Streams3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Consumer<String> printUpperCase = name -> {
            String upperCaseName = name.toUpperCase();
            System.out.println("Uppercase: " + upperCaseName);
        };

        Consumer<String> printWelcomeMessage = name -> {
            System.out.println("Welcome, " + name + "!");
        };

        Consumer<String> combined = printUpperCase.andThen(printWelcomeMessage);

        names.stream().forEach(combined);


    }
}
