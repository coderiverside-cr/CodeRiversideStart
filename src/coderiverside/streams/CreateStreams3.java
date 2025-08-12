package coderiverside.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CreateStreams3 {
    public static void main(String[] args) {
        Product[] array = {new Drink(), new Food()};
        List<Product> list = Arrays.asList(array);

        double sum = list.stream().parallel()
                .peek(p -> p.setPrice(BigDecimal.TEN))
                .mapToDouble(p -> p.getPrice().doubleValue())
                .sum();
        System.out.println("sum = " + sum);

        Arrays.stream(array)
                .filter(p-> p.getPrice().doubleValue() > 4)
                .forEach(p -> System.out.println("p = " + p));


    }
}
