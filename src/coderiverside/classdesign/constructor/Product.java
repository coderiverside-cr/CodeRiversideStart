package coderiverside.classdesign.constructor;

import java.math.BigDecimal;

public class Product {

    {
        this.price = BigDecimal.TEN;
    }

    static{
        discount = BigDecimal.ONE;
    }

    private static BigDecimal discount;

    public static BigDecimal getDiscount() {
        return discount;
    }

    private String name;
    private BigDecimal price;
    private BigDecimal tax;

    private Product(){
        this.name = "Default";
    }

    public Product(String name){
        this.name = name;
        this.price = BigDecimal.ZERO;
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
