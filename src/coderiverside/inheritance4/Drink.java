package coderiverside.inheritance4;

import java.math.BigDecimal;

public class Drink extends Product {

    public Drink(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public void serve() {
        System.out.println(" Serve water in a glass");
    }

    @Override
    BigDecimal calculatePrice() {
        return BigDecimal.TEN;
    }

}
