package coderiverside.streams;

import java.util.stream.DoubleStream;

public class ParallelStream0 {
    public static void main(String[] args) {

        double sum = DoubleStream.generate(() -> 10.0)
                .limit(1000)
                .parallel()
                .sum();

        System.out.println("sum = " + sum);
    }
}
