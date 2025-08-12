package coderiverside.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams5 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "is", "fun", "programming");

        Function<String, Integer> getLength = String::length;

        Function<Integer, Integer> square = length -> length * length;

        Function<String, Integer> lengthSquared = getLength.andThen(square);

        List<Integer> list = words.stream()
                .map(lengthSquared)
                .collect(Collectors.toList());

        System.out.println("list = " + list);
    }
}
