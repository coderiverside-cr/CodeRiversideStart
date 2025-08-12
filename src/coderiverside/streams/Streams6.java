package coderiverside.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 4, 3, 6, 8, 2, 1);

        List<Integer> list = numbers.stream()
                .distinct()
                .sorted()
                .skip(3)
                .collect(Collectors.toList());

        System.out.println("list = " + list);

    }
}
