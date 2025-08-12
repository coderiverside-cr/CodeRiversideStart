package coderiverside.optional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

// Don’t call get() directly
public class Main4 {
    public static void main(String[] args) {
        Optional<Product> p = getFromDB("Water");
        if(p.isPresent()) {
            System.out.println("p.get() = " + p.get());
        }
    }

    public static Optional<Product> getFromDB(String name) {
        List<Product> bd = List.of(
                new Product("Cake", BigDecimal.TEN),
                new Product("Coffee", BigDecimal.TEN)
        );

        return bd.stream()
                .filter(p -> p.getName().equals(name))
                .findFirst(); // Optional<Product>
    }
}
