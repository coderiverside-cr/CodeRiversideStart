package coderiverside.overloading;

import java.math.BigDecimal;

public class Product{

    private BigDecimal price;
    private BigDecimal discount = BigDecimal.ZERO;

    public void setPrice(double price){
        this.price = BigDecimal.valueOf(price);
    }

    public void setPrice(BigDecimal decimal){
        this.price = decimal;
    }

    public void setPrice(BigDecimal decimal, BigDecimal discount){
        this.price = decimal;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
               "price=" + price +
               ", discount=" + discount +
               '}';
    }
}
