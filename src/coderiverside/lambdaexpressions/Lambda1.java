package coderiverside.lambdaexpressions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda1 {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(
                List.of(
                        new Product("Water", BigDecimal.valueOf(10)),
                        new Product("Coffee", BigDecimal.valueOf(25)),
                        new Product("Tea", BigDecimal.valueOf(17))
                ));
        System.out.println("products = " + products);

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("products = " + products);

        Collections.sort(products, (p1,p2) -> p1.getName().compareTo(p2.getName())  );

        System.out.println("products = " + products);

    }
}
