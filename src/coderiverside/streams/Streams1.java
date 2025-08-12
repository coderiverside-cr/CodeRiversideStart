package coderiverside.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Alice",
                "Marlene",
                "Ramiro",
                "Alex",
                "Edward"
        );

        Map<Character, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println("grouped = " + grouped);
    }
}
