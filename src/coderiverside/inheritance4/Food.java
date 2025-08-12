package coderiverside.inheritance4;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Product {
    private final LocalDate bestBefore;

    public Food(String name, BigDecimal price) {
        super(name, price);
        this.bestBefore = LocalDate.now().plusDays(10);
    }
    public Food(String name, BigDecimal price, LocalDate bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public void serve() {
        System.out.println(" Serve food in a plate");
    }

    @Override
    BigDecimal calculatePrice() {
        return BigDecimal.TEN;
    }
}
