package coderiverside.inheritance;

import java.time.LocalDate;

public class Main4 {
    public static void main(String[] args) {
        method(new Food());
        method(new Drink());
    }

    public static void method(Product p) {
        String name = p.getName();  // Operacion Generica
        if(p instanceof Food){
            Food f = (Food) p;  // Casting a un tipo especifico
            LocalDate bestBefore = f.getBestBefore();   // Operacion especifica de subtipo
        }
        if(p instanceof Drink){
            Drink d = (Drink) p;
            //LocalDate bestBefore = d.getBestBefore(); // Operacion especifica de subtipo
        }
    }
}
