package coderiverside.inheritance;

import java.time.LocalDate;

public class Food extends Product {
    private LocalDate bestBefore;

    public Food(){
        super("Food");
        System.out.println("bestBefore = " + bestBefore);
    }

    public Food(String name) {
        super(name);
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }
}
