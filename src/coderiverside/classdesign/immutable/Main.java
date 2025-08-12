package coderiverside.classdesign.immutable;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Product product = new Product("Hat");
        System.out.println("product.getName() = " + product.getName());

        BigDecimal price = BigDecimal.valueOf(9.99);
        Product productHat = new Product(product.getName(), price);
        System.out.println("productHat = " + productHat);

        System.out.println("Discount = " + productHat.getDiscount(BigDecimal.valueOf(0.10)));
    }
}
