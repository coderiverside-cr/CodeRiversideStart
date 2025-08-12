package coderiverside.inheritance4;

import java.math.BigDecimal;

public abstract class Product extends Category {

    private final String name;
    private final BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }

    abstract void serve();
}
