package coderiverside.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Collectors. Perform Grouping or Partitioning of the Stream Content
public class Collect5 {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
                new Food("Cake", BigDecimal.valueOf(10.5)),
                new Drink("Water", BigDecimal.valueOf(20.0)),
                new Product("Anything", BigDecimal.valueOf(15.75))
        );

        Map<Boolean, List<Product>> productTypes = list.stream()
                .collect(
                        Collectors.partitioningBy(
                                p -> p instanceof Drink
                        )
                );

        System.out.println("productTypes = " + productTypes);
    }
}
