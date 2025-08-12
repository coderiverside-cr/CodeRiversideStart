package coderiverside.streams;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Product {
    private LocalDate bestBefore;

    public Food(String name, BigDecimal price) {
        super(name, price);
        this.bestBefore = LocalDate.now().plusDays(10);
    }

    public Food(String name, BigDecimal price, LocalDate bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public Food() {
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

}
