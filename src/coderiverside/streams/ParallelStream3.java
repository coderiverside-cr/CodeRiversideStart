package coderiverside.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStream3 {
    public static void main(String[] args) {
        Random random = new Random();
        List<BigDecimal> prices = Stream.generate(() -> BigDecimal.valueOf(1 + (random.nextDouble() * 99))) // Precios entre 1 y 100
                .limit(100000)
                .collect(Collectors.toList());

        List<Double> list = prices.stream().parallel()
                .map(p -> p.doubleValue())
                .collect(Collectors.toList());

        System.out.println("list size = " + list.size());

    }
}
