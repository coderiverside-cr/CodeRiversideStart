package coderiverside.inheritance3;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Product {
    private LocalDate bestBefore;

    public Food(String name, BigDecimal price) {
        super(name, price);
        this.bestBefore = LocalDate.now().plusDays(3);
    }

    public Food(String name, BigDecimal price, LocalDate bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public BigDecimal getPrice(){
        BigDecimal discount = this.bestBefore.isEqual(
                LocalDate.now().plusDays(1))
                ?
                super.getPrice().multiply(BigDecimal.valueOf(0.5)):
                BigDecimal.ZERO;
        return super.getPrice().subtract(discount);
    }
}
