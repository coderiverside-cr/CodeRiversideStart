package coderiverside.inheritance4;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args){
        //order(new Product());
        order(new Drink(
                        "Coffee",
                        BigDecimal.valueOf(2.99)
                )
        );
        order(new Food(
                        "Pasta",
                        BigDecimal.valueOf(10)
                )
        );
    }

    public static void order(Product p) {
        p.serve();
    }
}
