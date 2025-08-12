package coderiverside.streams;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public final String getName() {
        return this.name;
    }

    public BigDecimal getPrice(){
        return this.price;
    }

    public Product() {
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
