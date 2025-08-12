package coderiverside.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStream1 {
    public static void main(String[] args) {
        List<BigDecimal> prices = Stream.generate(() -> BigDecimal.valueOf(10))
                .limit(1000)
                .collect(Collectors.toList());

        double sum = prices.stream().sequential()
                .mapToDouble(
                        p -> p.doubleValue()
                ).parallel()
                .sum();

        System.out.println("sum = " + sum);
    }
}
