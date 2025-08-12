package coderiverside.optional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        Optional<Product> optionalProduct = getFromDB("Cake");
        if(optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            System.out.println("p.getPrice() = " + product.getPrice());
        }
    }

    public static Optional<Product> getFromDB(String name) {
        List<Product> bd = List.of(
                new Product("Cake", BigDecimal.TEN),
                new Product("Coffee", BigDecimal.TEN)
        );

        for (Product product : bd) {
            if (product.getName().equals(name)) {
                return Optional.of(product);
            }
        }

        return Optional.empty();
    }


}
