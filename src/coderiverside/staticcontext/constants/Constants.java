package coderiverside.staticcontext.constants;

import java.math.BigDecimal;

public class Constants {

    private final Product product = new Product();

    public static void main(String[] args) {
        Product p = new Product();
        final BigDecimal discount = p.getDiscount(BigDecimal.valueOf(0.10));

        Constants constants = new Constants();
        constants.product.setBrand("Code");
        constants.product.setBrand("Riverside");

        //constants.product = new Product();

    }

}

class Product {

    private final String name;
    private String brand;
    private final BigDecimal price = BigDecimal.valueOf(9.99);

    public Product() {
        this.name = "Jacket";
    }

    public Product(String name) {
        this.name = name;
    }

    public BigDecimal getDiscount(final BigDecimal discount ) {
        return this.price.multiply(discount);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

