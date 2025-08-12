package coderiverside.classdesign.immutable;

import java.math.BigDecimal;

public class Product {

    private final String name;
    private final BigDecimal price;

    public Product(String name) {
        this.name = name;
        this.price = BigDecimal.ZERO;
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public BigDecimal getDiscount(BigDecimal discount){
        return price.multiply(discount);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
               "name='" + name + '\'' +
               ", price=" + price +
               '}';
    }
}
