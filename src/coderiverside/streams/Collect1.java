package coderiverside.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

// Collectors. Calculating summary values
public class Collect1 {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
                new Food("Cake", BigDecimal.valueOf(10.5)),
                new Drink("Water", BigDecimal.valueOf(20.0)),
                new Product("Anything", BigDecimal.valueOf(15.75))
        );

        DoubleSummaryStatistics stats = list.stream()
                .collect(Collectors.summarizingDouble(
                        p -> p.getPrice().doubleValue()
                ));

        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Máx: " + stats.getMax());
        System.out.println("Mín: " + stats.getMin());
        System.out.println("Count: " + stats.getCount());

    }
}
