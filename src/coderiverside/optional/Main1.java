package coderiverside.optional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Main1 {
    public static void main(String[] args) {
        Product p = getFromDB("Water");
        if(Objects.nonNull(p)) {
            System.out.println("p.getPrice() = " + p.getPrice());
        }
    }

    public static Product getFromDB(String name) {
        List<Product> bd = List.of(
                new Product("Cake", BigDecimal.TEN),
                new Product("Coffee", BigDecimal.TEN)
        );

        for (Product product : bd) {
            if (product.getName().equals(name)) {
                return product;
            }
        }

        return null;
    }

}
