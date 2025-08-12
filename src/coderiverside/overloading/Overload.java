package coderiverside.overloading;

import java.math.BigDecimal;

public class Overload {
    public static void main(String[] args) {
        Product product = new Product();

        product.setPrice(5);
        System.out.println("product = " + product);
        product.setPrice(BigDecimal.valueOf(15));
        System.out.println("product = " + product);
        product.setPrice(BigDecimal.TEN, BigDecimal.ZERO);
        System.out.println("product = " + product);



    }

}

