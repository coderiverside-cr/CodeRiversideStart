package coderiverside.staticcontext.access;

import java.math.BigDecimal;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        System.out.println("Product.defaultExpirationPeriod = "
                           + Product.getDefaultExpirationPeriod().getDays());

        Product.setDefaultExpirationPeriod(4);
        System.out.println("Product.defaultExpirationPeriod = "
                           + Product.getDefaultExpirationPeriod().getDays());

        Product p1 = new Product();
        Product p2 = new Product();

        System.out.println("Product.defaultExpirationPeriod = "
                           + Product.getDefaultExpirationPeriod().getDays());

        p1.setDefaultExpirationPeriod(3);
        System.out.println("Product.defaultExpirationPeriod = "
                           + Product.getDefaultExpirationPeriod().getDays());

        System.out.println("p2.defaultExpirationPeriod = " + p2.getDefaultExpirationPeriod().getDays());

        Product p3 = new Product();
        System.out.println("p3.defaultExpirationPeriod = " + p3.getDefaultExpirationPeriod().getDays());

        System.out.println("Product.defaultExpirationPeriod = "
                           + Product.getDefaultExpirationPeriod().getDays());

        p1.getName();
        //Product.getName();

    }

}

class Product {

    private static Period defaultExpirationPeriod;

    static {
        defaultExpirationPeriod = Period.ofDays(5);
    }
    private String name;
    private String brand;
    private BigDecimal price;

    public static void setDefaultExpirationPeriod(int days){
        defaultExpirationPeriod = Period.ofDays(days);
    }

    public static Period getDefaultExpirationPeriod(){
        return defaultExpirationPeriod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

