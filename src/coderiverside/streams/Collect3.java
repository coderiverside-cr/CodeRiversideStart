package coderiverside.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Collectors. Gathering stream elements into a collection such as list, set, or map
public class Collect3 {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
                new Food("Cake", BigDecimal.valueOf(10.5)),
                new Drink("Water", BigDecimal.valueOf(20.0)),
                new Product("Anything", BigDecimal.valueOf(15.75))
        );

        List<Product> drinks = list.stream()
                .filter(p -> p instanceof Drink)
                .collect(
                        Collectors.toList()
                );

        System.out.println("drinks = " + drinks);
    }
}
