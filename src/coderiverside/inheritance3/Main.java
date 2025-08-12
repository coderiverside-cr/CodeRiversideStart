package coderiverside.inheritance3;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        order(new Product("Something", BigDecimal.valueOf(10)));
        order(new Food("Pasta", BigDecimal.valueOf(2.99)));
        order(new Drink("Coffee", BigDecimal.valueOf(1.99)));
    }

    public static void order(Product p){
        BigDecimal price = p.getPrice();
        System.out.println("price = " + price);
    }
}
