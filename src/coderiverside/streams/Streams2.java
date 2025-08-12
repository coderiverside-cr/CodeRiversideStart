package coderiverside.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "is", "fun");

        String sentence = words.stream()
                .collect(Collectors.joining(" "));

        System.out.println("sentence = " + sentence);
    }
}
