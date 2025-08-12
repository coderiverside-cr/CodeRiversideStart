package coderiverside.classdesign.encapsulation;

import java.math.BigDecimal;

public class Main {
    public static void main(String... args) {
        Product product = new Product();
        product.setPrice(BigDecimal.valueOf(100));
        product.setName("Jacket");

        System.out.println("product.price = " + product.getPrice());
        System.out.println("product.name = " + product.getName());

        System.out.println("product = " + product);
    }
}
