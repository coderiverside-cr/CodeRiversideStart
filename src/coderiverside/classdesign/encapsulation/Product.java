package coderiverside.classdesign.encapsulation;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal price;
    private BigDecimal tax;

    private void calculateTax(){
        this.tax = price.multiply(BigDecimal.TEN);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
        calculateTax();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
               "name='" + name + '\'' +
               ", price=" + price +
               ", tax=" + tax +
               '}';
    }
}
