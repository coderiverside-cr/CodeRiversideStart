package coderiverside.classesobjetos;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        p1.setName("Scarf");
        p2.setName("Hat");

        p1.setPrice(BigDecimal.valueOf(10.5));
        BigDecimal price = p1.getPrice();
    }

    public void operation(int parameter){
        var value1 = "String";
        var value2 = parameter;

        for (var i = 0; i < 5; i++) {
            String var = "Code";
        }
    }

}
