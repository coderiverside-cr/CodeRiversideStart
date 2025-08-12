package coderiverside.streams;

import java.util.stream.IntStream;

public class CreateStreams1 {
    public static void main(String[] args) {
        int sum = IntStream.generate(() -> (int) (Math.random() * 10))
                .peek(n -> System.out.println("n = " + n))
                .takeWhile(e -> e != 3)
                .sum();
        System.out.println("sum = " + sum);

    }
}
