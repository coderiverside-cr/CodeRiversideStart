package coderiverside.streams;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

// Collectors. Perform a Conversion of a Collector Result
public class Collect4 {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
                new Food("Cake", BigDecimal.valueOf(10.5)),
                new Drink("Water", BigDecimal.valueOf(20.0)),
                new Product("Anything", BigDecimal.valueOf(15.75))
        );

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);

        String s = list.stream()
                .collect(Collectors.collectingAndThen(
                                Collectors.averagingDouble(
                                        p -> p.getPrice().doubleValue()
                                ),
                                n -> numberFormat.format(n)
                        )

                );
        System.out.println("s = " + s);

    }
}
