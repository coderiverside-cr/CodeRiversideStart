package coderiverside.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Collectors. Mapping and Joining stream elements.
public class Collect2 {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
                new Food("Cake", BigDecimal.valueOf(10.5)),
                new Drink("Water", BigDecimal.valueOf(20.0)),
                new Product("Anything", BigDecimal.valueOf(15.75))
        );

        String s = list.stream()
                .collect(Collectors.mapping(
                        p -> p.getName(),
                        Collectors.joining(",")
                ));

        System.out.println("s = " + s);

    }
}
