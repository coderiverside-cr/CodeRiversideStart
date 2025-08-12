package coderiverside.serialization;
import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable{
    private String name;
    private BigDecimal price;
    private static final long serialVersionUID = 2L;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
