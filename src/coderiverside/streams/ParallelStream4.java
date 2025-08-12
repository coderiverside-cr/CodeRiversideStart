package coderiverside.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStream4 {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(0, 1000).boxed().toList();

        StringBuilder sb = new StringBuilder();

        numbers.parallelStream()
                .forEach(n -> sb.append(n).append(", "));

        System.out.println("Result: " + sb);

        String result = numbers.stream()
                .parallel()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("Collect result = " + result);

    }
}
